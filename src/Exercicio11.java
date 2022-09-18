import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        // ler preço de custo do produto e percentual
        // calcuar preço mais o percentual
        // mostrar o valor final da venda

        Scanner sc = new Scanner(System.in);
        double valor, valorFinal, taxa;

        System.out.print("Digite o preço de custo do produto: ");
        valor = sc.nextDouble();

        System.out.print("Digite o percentual: ");
        taxa = sc.nextDouble();
        taxa = taxa / 100;

        valorFinal = valor + (valor * taxa);
        System.out.printf("O valor final da venda é R$%.2f", valorFinal);
    }
}
