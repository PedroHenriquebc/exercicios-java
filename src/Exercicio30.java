import java.util.Scanner;

/**
 * ler 3 valores inteiros distintos
 * imprimir em ordem crescente
 */
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, menor, meio, maior;

        System.out.print("Digite o numero 1: ");
        n1 = sc.nextInt();
        System.out.print("Digite o numero 2: ");
        n2 = sc.nextInt();
        System.out.print("Digite o numero 3: ");
        n3 = sc.nextInt();

        if (n1 < n2) {
            if (n2 < n3) {
                System.out.println(n1 + "-" + n2 + "-" + n3);
            } else if (n1 < n3) {
                System.out.println(n1 + "-" + n3 + "-" + n2);
            } else {
                System.out.println(n3 + "-" + n1 + "-" + n2);
            }
        } else if (n2 < n3) {
            if (n1 < n3) {
                System.out.println(n2 + "-" + n1 + "-" + n3);
            } else {
                System.out.println(n2 + "-" + n3 + "-" + n1);
            }
        } else {
            System.out.println(n3 + "-" + n2 + "-" + n1);
        }

    }
}
