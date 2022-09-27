import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        /**
         * ler n numeros
         * calcular se cada um e positivo, negativo ou zero
         * mostrar em cada resposta
         */

        Scanner sc = new Scanner(System.in);

        int n, cont = 0;

        while (cont < 5) {
            System.out.print("Digite um nuemro: ");
            n = sc.nextInt();
            if (n > 0) {
                System.out.println("positivo");
            } else if (n < 0) {
                System.out.println("negativo");
            } else {
                System.out.println("zero");
            }
            cont++;
        }
    }
}
