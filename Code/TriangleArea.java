import java.util.Scanner;
class TriangleArea {
   public static void main(String args[]) {   
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite a base do triangulo:");
      double base = scanner.nextDouble();

      System.out.println("Digite a altura do triangulo:");
      double height = scanner.nextDouble();

      //Area = (base x altura)/2
      double area = (base* height)/2;
      System.out.println("A area do triangulo e: " + area);      
   }
}