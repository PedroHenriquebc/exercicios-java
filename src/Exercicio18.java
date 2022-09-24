import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        /**
         * ler a idade de 75 pessoas
         * calcular se menor ou maior de idade
         * mostrar maior ou menor de idade para cada pessoa
         */

        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int idade;

        while (cont < 75) {
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();

            if (idade >= 18) {
                System.out.println("Voce e maior de idade!");
            } else {
                System.out.println("Voce e menor de idade!");
            }
            cont ++;
        }
    }
}
