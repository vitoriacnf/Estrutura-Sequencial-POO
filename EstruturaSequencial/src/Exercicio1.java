import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		 {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			double largura, comprimento, metroQuad, areaTerreno, precoTerreno;
			System.out.printf("Digite a largura do terreno: ");
			largura = sc.nextDouble();
			System.out.printf("Digite o comprimento do terreno: ");
			comprimento = sc.nextDouble();
			System.out.printf("Digite o metro quadrado: ");
			metroQuad = sc.nextDouble();
			areaTerreno = (largura * comprimento);
			System.out.printf("Área do terreno: %.2f%n", areaTerreno);
			precoTerreno = (metroQuad * areaTerreno);
			System.out.printf("Área do terreno: %.2f%n", precoTerreno);

			sc.close();
			
		}

	}

}