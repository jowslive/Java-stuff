import java.util.Scanner;

public class NumeroPrimo
{
   public static void main(String args[])
   {
      int n;
      int status = 1;
      int num = 3;
      //Para capturar o numero N
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite o valor de N:");
      //O que o usuario digitar sera capturado na variavel n
      n = scanner.nextInt();
      if (n >= 1)
      {
         System.out.println("Os "+n+" primeiros numeros primos sao:");
         //2 é um numero primeiro
         System.out.println(2);
      }

      for ( int i = 2 ; i <=n ;  )
      {
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               status = 0;
               break;
            }
         }
         if ( status != 0 )
         {
            System.out.println(num);
            i++;
         }
         status = 1;
         num++;
      }         
   }
}