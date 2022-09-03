import java.util.Locale;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distPercorrida; 
        double combustivelGasto, consumoMedio;

        System.out.print("Distância percorrida: ");
        distPercorrida = sc.nextInt();
        System.out.print("Combustível gasto: ");
        combustivelGasto = sc.nextDouble();
        consumoMedio = distPercorrida / combustivelGasto;
        System.out.printf("Consumo médio: %.3f " , consumoMedio);

        sc.close();

    }
    
}
