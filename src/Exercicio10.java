import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // receber o valor de uma compra
        // calcular o valor das 5 prestações
        // mostrar as 5 prestações

        Scanner sc = new Scanner(System.in);
        double valor, prestacao;

        System.out.print("Digite o valor total da compra: ");
        valor = sc.nextDouble();

        prestacao = valor / 5;

        System.out.printf("O valor da prestação em 5x é de R$%.2f", prestacao);
    }
}
