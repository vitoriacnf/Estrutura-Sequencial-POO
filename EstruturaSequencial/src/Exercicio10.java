import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int tempo, horas, minutos, segundos;

    System.out.print("Digite o tempo em segundos: ");
    tempo = sc.nextInt();
    horas = tempo / 3600;
    tempo = tempo - (horas * 3600);
    minutos = tempo / 60;
    segundos = tempo - (minutos * 60);


    System.out.printf("Horas: %d ", horas);
    System.out.printf("Minutos: %d ", minutos);
    System.out.printf("Segundos: %d ", segundos);
    sc.close();
    }

}
