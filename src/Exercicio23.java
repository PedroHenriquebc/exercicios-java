import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        /**
         * ler um numero
         * calcular se o numero e maior que 80, menor que 25 ou igual a 40
         * mostrar na tela o resultado
         */

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite um numero: ");
        n = sc.nextInt();

        if (n == 40) {
            System.out.println("O numero e igual a 40!");
        } else if (n < 25) {
            System.out.println("O numero e menor que 25!");
        } else if (n > 80) {
            System.out.println("O numero e maior que 80!");
        }
    }
}
