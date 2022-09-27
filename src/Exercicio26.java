import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        /**
         * ler um numero de 1 a 5
         * imprimir mensagem de numero invalido se nao estiver no intervalo
         * escrever o numero por extenso
         */

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite um numero de 1 a 5: ");
        n = sc.nextInt();

        while (n > 5 || n < 1) {
            System.out.print("Numero invalido! Digite um numero de 1 a 5: ");
            n = sc.nextInt();
        }

        switch (n) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("quatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
        }
    }
}
