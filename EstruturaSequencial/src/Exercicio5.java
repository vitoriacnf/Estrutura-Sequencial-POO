import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		double precoUnit, valorPago, troco;
		int quantProd;
		
		System.out.printf("Preço unitário do produto: R$ ");
		precoUnit = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantProd = sc.nextInt();
		System.out.print("Valor recebido: R$ ");
		valorPago = sc.nextDouble();
		troco = valorPago - (precoUnit * quantProd);
		System.out.printf("TROCO = R$ %.2f " , troco);

		
		sc.close();
		
		
	}
}
