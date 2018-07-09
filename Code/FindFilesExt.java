public class FindFilesWithThisExtn {
	//Digite o caminho da pasta que voce deseja procurar
	private static final String fileLocation = "/Users/jows/Documents";
	
	//extensao que voce deseja procurar
	private static final String searchThisExtn = ".png";

	public static void main(String args[]) {
		FindFilesWithThisExtn obj = new FindFilesWithThisExtn();
		obj.listFiles(fileLocation, searchThisExtn);
	}

	public void listFiles(String loc, String extn) {

		SearchFiles files = new SearchFiles(extn);

		File folder = new File(loc);

		if(folder.isDirectory()==false){
			System.out.println("Essa pasta nao existe : " + fileLocation);
			return;
		}

		String[] list = folder.list(files);

		if (list.length == 0) {
			System.out.println("Nao existem arquivos com a extensao " + extn );
			return;
		}

		for (String file : list) {
			String temp = new StringBuffer(fileLocation).append(File.separator)
					.append(file).toString();
			System.out.println("Arquivo : " + temp);
		}
	}

	public class SearchFiles implements FilenameFilter {

		private String ext;

		public SearchFiles(String ext) {
			this.ext = ext;
		}
		
		@Override
		public boolean accept(File loc, String name) {
			if(name.lastIndexOf('.')>0)
            {
               // obtem o ultimo indice para '.' 
               int lastIndex = name.lastIndexOf('.');
               
               // obtem a extensao
               String str = name.substring(lastIndex);
               
               // extensao correspondente
               if(str.equalsIgnoreCase(ext))
               {
                  return true;
               }
            }
            return false;
			
		}
	}
}