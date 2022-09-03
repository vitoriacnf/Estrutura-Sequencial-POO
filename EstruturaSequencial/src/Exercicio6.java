import java.util.Locale;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r, pi, areaR;
        pi = 3.14159;

        System.out.print("Digite o valor do raio do círculo: ");
        r = sc.nextDouble();
        areaR = Math.pow(r, 2) * pi;
        System.out.printf("ÁREA = %.3f" , areaR);

        sc.close();
    }
}
