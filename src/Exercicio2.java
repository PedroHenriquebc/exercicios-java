import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        System.out.println("A soma dos dois números é: " + (n1 + n2));
        System.out.println("A subtração do primeiro pelo segundo número é: " + (n1 - n2));
        System.out.println("A multiplicação dos dois números é: " + (n1 * n2));
        System.out.println("A divisão do primeiro pelo segundo número é: " + (n1 / n2));
    }
}
