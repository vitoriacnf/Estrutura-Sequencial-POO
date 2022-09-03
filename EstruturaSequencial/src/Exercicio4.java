import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		{		 
		Scanner sc = new Scanner(System.in); 

			int x, y, soma;
			
			System.out.print("Digite o valor de x: ");
			x = sc.nextInt();
			System.out.print("Digite o valor de y: ");
			y = sc.nextInt();
			soma = (x + y);
			System.out.printf("Soma: " +  soma);
			sc.close();
		}
	}
	
}
