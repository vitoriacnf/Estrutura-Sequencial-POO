import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in); {

			double base, altura, area, perimetro, diagonal;

			System.out.printf("Base do retângulo: ");
			base = sc.nextDouble();
			System.out.printf("Altura do retângulo: ");
			altura = sc.nextDouble();
			area = (base * altura);
			System.out.printf("AREA: %.4f%n", area);
			perimetro = 2 * (base + altura);
			System.out.printf("PERIMETRO: %.4f%n", perimetro);
			diagonal = Math. pow(base , 2) + Math. pow(altura , 2);
			diagonal = (Math.sqrt(diagonal));
			System.out.printf("DIAGONAL: %.4f" , diagonal);
			
			sc.close();
			
		
			

		}

	}

}
