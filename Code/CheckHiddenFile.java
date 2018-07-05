import java.io.File;
import java.io.IOException;
 
public class HiddenPropertyCheck
{
 
    public static void main(String[] args) throws IOException, SecurityException
    {	
    	// Digitar o caminho do arquivo aqui
    	File file = new File("c:/myfile.txt");
 
    	if(file.isHidden()){
    		System.out.println("Esse arquivo especifico esta escondido");
    	}else{
    		System.out.println("Esse arquivo especifico nao esta escondido");
    	}
    }
}