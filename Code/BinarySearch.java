import java.util.Scanner;
class BinarySearch
{
   public static void main(String args[])
   {
      int counter, num, item, array[], first, last, middle;
      //Para capturar o que o usuario digitar
      Scanner input = new Scanner(System.in);
      System.out.println("Digite o numero de elementos:");
      num = input.nextInt(); 

      //Criando um array para "guardar" os numeros
      array = new int[num];

      System.out.println("Digite " + num + " numeros");
      //Loop para guardar cada numero em um array
      for (counter = 0; counter < num; counter++)
          array[counter] = input.nextInt();

      System.out.println("Digite o valor a ser procurado:");
      item = input.nextInt();
      first = 0;
      last = num - 1;
      middle = (first + last)/2;

      while( first <= last )
      {
         if ( array[middle] < item )
           first = middle + 1;
         else if ( array[middle] == item )
         {
           System.out.println(item + " foi achado na posicao " + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " nao foi achado.\n");
   }
}