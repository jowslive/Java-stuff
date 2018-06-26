class Exemplo
{
   public static void main(String args[])
   {
      try{
         int num1=30, num2=0;
         int output=num1/num2;
         System.out.println ("Resultado: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("Voce nao deveria dividir um numero por zero");
      }
   }
}