import java.util.Scanner;
class ReverseNumberWhile
{
   public static void main(String args[])
   {
      int num=0;
      int reversenum =0;
      System.out.println("Digite o numero e pressione enter: ");
      //Isso ira "capturar" o que o usuario digitar
      Scanner in = new Scanner(System.in);
      //O que foi "capturado" agora sera armazenado em numero num
      num = in.nextInt();
      //While Loop: Logica para achar o numero reverso
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("O numero reverso sera: "+reversenum);
   }
}