import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        /**
         * ler dois numeros
         * calcular se sao iguais ou diferentes
         * mostrar o resultado porem se forem diferentes mostrar o maior
         */

        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("O numero " + n1 + " e o maior ");
        } else if (n1 < n2) {
            System.out.println("O numero " + n2 + " e o maior ");
        } else {
            System.out.println("Os numeros sao iguais");
        }
    }
}
