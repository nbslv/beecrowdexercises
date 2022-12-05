import java.io.IOException;
import java.util.Scanner;

public class Soma {

    public static void main(String[] args) throws IOException {
   Scanner ler = new Scanner(System.in);
   int a,b;
   int X;

   System.out.println("Digite o valor de A: ");
   a = ler.nextInt();

   System.out.println("Digite o valor de B: ");
   b = ler.nextInt();

   X = (a + b);
   System.out.println("O resultado da soma de A e B é " + X);
    }

}