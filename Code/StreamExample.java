import java.util.ArrayList;
import java.util.List;
public class Example{ 
   public static void main(String[] args) {    
	List<String> names = new ArrayList<String>();
	names.add("Jows");
	names.add("Pedro");
	names.add("Angela");
	names.add("Alice");
		
	//Usando Stream e a expressao Lambda
	long count = names.stream().filter(str->str.length()<6).count();
	System.out.println("Existem "+count+" strings com tamanho menor que 6");

   }  
}