import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        //ler dois valores A e B

        //trocar o valor de A com o de B

        //mostrar os valores trocados

        Scanner sc = new Scanner(System.in);
        int A = 0, B = 0, C = 0;

        System.out.print("Informe o valor de A: ");
        A = sc.nextInt();

        System.out.print("Informe o valor de B: ");
        B = sc.nextInt();

        System.out.print("O valor de A é: " + A + "\n");
        System.out.print("O valor de B é: " + B + "\n");

        C = A;
        A = B;
        B = C;

        System.out.print("O novo valor de A é: " + A + "\n");
        System.out.print("O novo valor de B é: " + B + "\n");

    }
}
