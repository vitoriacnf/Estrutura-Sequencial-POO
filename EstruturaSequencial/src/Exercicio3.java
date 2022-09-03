import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n1, n2;
		int id1, id2; 
		double mediaId;
		
		System.out.println("Dados da primeira pessoa");
		System.out.print("Nome: ");
		n1 = sc.nextLine();
		System.out.print("Idade: ");
		id1 = sc.nextInt();
		System.out.println("Dados da segunda pessoa");
		System.out.print("Nome: ");
		sc.nextLine();
		n2 = sc.nextLine();
		System.out.print("Idade: ");
		id2 = sc.nextInt();
		mediaId = (id1 + id2);
		mediaId = mediaId / 2;
		System.out.printf("A idade média de %s e %s é de %.1f anos" , n1 , n2 , mediaId);
		
		sc.close();
		
		
		

	}

}