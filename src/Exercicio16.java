import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        /**
         * ler nome do aluno e as 3 notas
         * calcular a media
         * mostrar se aprovado, reprovado ou recupercao
         */

        Scanner sc = new Scanner(System.in);

        String nome;
        double n1, n2, n3, media;

        System.out.print("Digite seu nome: ");
        nome = sc.next();

        System.out.print("Digite a nota 1: ");
        n1 = sc.nextInt();

        System.out.print("Digite a nota 2: ");
        n2 = sc.nextInt();

        System.out.print("Digite a nota 3: ");
        n3 = sc.nextInt();

        media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.printf("%s foi aprovado com media %.2f!", nome, media);
        } else if (media > 5 && media < 7) {
            System.out.printf("%s ficou com media %.2f e esta na recuperacao!", nome, media);
        } else {
            System.out.printf("%s ficou com media %.2f e esta reprovado!", nome, media);
        }
    }
}
