import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        double nota1 = 0, nota2 = 0, nota3 = 0, media = 0;

        System.out.print("Informe seu nome: ");
        nome = sc.next();

        System.out.print("Informe a nota 1: ");
        nota1 = sc.nextDouble();

        System.out.print("Informe a nota 2: ");
        nota2 = sc.nextDouble();

        System.out.print("Informe a nota 3: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Nome: %s %n", nome);
        System.out.printf("Média: %.2f", media);
    }
}
