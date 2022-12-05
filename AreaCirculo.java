import java.io.IOException;
import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        double n, R, A;
        n = 3.14159;

        R = ler.nextDouble();
        A = R * R;
        System.out.printf("A=%.4f\n", n*A);

    }

}