import java.io.*;
import java.net.*;

     public class PseudoPing {
         public static void main(String args[]) {
             try {
             Socket t = new Socket(args[0], 7);
             DataInputStream dis = new DataInputStream(t.getInputStream());
             PrintStream ps = new PrintStream(t.getOutputStream());
             ps.println("Ola");
             String str = is.readLine();
             if (str.equals("Ola"))
             System.out.println("Vivo!") ;
             else
             System.out.println("Morto ou echo não respondendo!"); 
             t.close();
         }
             catch (IOException e) {
         e.printStackTrace();}
     }
}