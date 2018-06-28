import java.util.Scanner;
class CircleArea
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Digite o raio do circulo: ");
      /*Guardando o radius em uma variavel double
       * porque o usuario pode digitar o raio em decimal
       */
      double radius = sc.nextDouble();
      //Area = PI*raio*raio
      double area = Math.PI * (radius * radius);
      System.out.println("A area do circulo e: " + area);
      //Circunferencia = 2*PI*raio
      double circumference= Math.PI * 2*radius;
      System.out.println( "A circunferencia do circulo e:"+circumference) ;
   }
}