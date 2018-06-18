package guess;

public class Guess {

    public static void main(String[] args)throws java.io.IOException {
        char ch,answer='E';
        System.out.println("Pense em uma letra entre A e E.");
        System.out.println("Digite a letra que você pensou:");
        ch=(char)System.in.read();
        if(ch==answer)
            
        {
            System.out.println("Voce acertou!");
        }
        else {
            System.out.println("Voce errou!");
        }
    }
    
}
