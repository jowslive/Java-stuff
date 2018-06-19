import java.util.Scanner;

public class Multiplicar {

    public static void main(String[] args) {

         //Isso ira ler o que usuario digitar
         
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");

         //Esse metodo ira ler o numero digitado
        int num1 = scan.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int num2 = scan.nextInt();

         //Fechando o Scanner apos o uso
        scan.close();
        
         //Calculando o produto dos dois numeros
        int product = num1*num2;
        
         //Mostrando o resultado da multiplicacao
        System.out.println("Resultado: " +product);
    }
}