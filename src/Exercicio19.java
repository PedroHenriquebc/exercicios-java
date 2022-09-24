import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        /**
         * ler nome e sexo de 56 pessoas
         * calcular total de homens e mulheres
         * informar se e homem ou mulher e no final o total de cada sexo
         */

        Scanner sc = new Scanner(System.in);

        String nome, sexo;
        int cont = 0, homens = 0, mulheres = 0;

        while (cont < 56) {
            System.out.print("Digite seu nome: ");
            nome = sc.next();
            System.out.print("Digite seu sexo('f' ou 'm'): ");
            sexo = sc.next();

            System.out.printf("Nome: %s\n", nome );

            if (sexo.equalsIgnoreCase("f")) {
                mulheres++;
                System.out.println("Sexo: Feminino");
            } else if (sexo.equalsIgnoreCase("m")) {
                homens++;
                System.out.println("Sexo: Masculino");
            }

            cont++;
        }

        System.out.printf("Total de homens: %d\n", homens);
        System.out.printf("Total de mulheres: %d\n", mulheres);
    }
}
