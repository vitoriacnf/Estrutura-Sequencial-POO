import java.util.Locale;
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double  a, b, c, areaQuadr, areaTriang, areaTrap; 

        System.out.print("Digite a medida A: ");
        a = sc.nextDouble();
        System.out.print("Digite a medida B: ");
        b = sc.nextDouble();
        System.out.print("Digite a medida C: ");
        c = sc.nextDouble();
        areaQuadr = Math.pow(a, 2);
        System.out.printf("ÁREA DO QUADRADO: %.4f%n" , areaQuadr);
        areaTriang = (a * b) / 2;
        System.out.printf("ÁREA DO TRIÂNGULO: %.4f%n" , areaTriang);
        areaTrap = ((a + b) * c) / 2;
        System.out.printf("ÁREA DO TRAPÉZIO: %.4f%n" , areaTrap);


        sc.close();
    }
}
