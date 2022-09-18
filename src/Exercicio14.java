import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        //ler dois valores
        //calcular o maior entre os dois
        //escrever o maior

        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.print("Informe o numero 1: ");
        n1 = sc.nextInt();

        System.out.print("Informe o numero 2: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("O numero 1 é o maior numero!");
        } else if (n1 < n2) {
            System.out.println("O numero 2 é o maior numero!");
        } else {
            System.out.println("Os numeros sao iguais!");
        }
    }
}
