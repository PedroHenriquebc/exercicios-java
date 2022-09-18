import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // receber um valor que foi depositado
        // calcular o valor final com rendimento dos juros
        // exibir o valor final

        Scanner sc = new Scanner(System.in);
        double valor, valorFinal;
        double juros = 0.0007;

        System.out.print("Digite o valor para ser depositado: R$");
        valor = sc.nextDouble();

        valorFinal = valor + (valor * juros);

        System.out.printf("O valor final com redimento foi de R$%.2f", valorFinal);
    }
}
