import java.util.Locale;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double valorHora, pagamentoTotal;
        int horasTrab;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Valor por hora: R$ ");
        valorHora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        horasTrab = sc.nextInt();
        pagamentoTotal = valorHora * horasTrab;
        System.out.printf("O pagamento para %s deve ser R$ %.2f " , nome,  pagamentoTotal);

        sc.close();

    }
}