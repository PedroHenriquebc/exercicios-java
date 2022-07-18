import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        //ler temperatura em celsius

        //transformar de celsius para fahrenheit  F=(9*C+160) / 5,

        //mostrar a temperatura convertida

        Scanner sc = new Scanner(System.in);
        double F = 0, C = 0;

        System.out.print("Informe a temperatura em Celsius: ");
        C = sc.nextDouble();

        F = (9 * C + 160) / 5;

        System.out.printf("A temperatura em Celsius é %.1f %n", C);
        System.out.printf("A temperatura em Fahrenheit é %.1f", F);
    }
}
