import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        /**
         * ler preço de custo e preço de venda de 40 produtos
         * calcular se houve lucro, prejuizo ou empate
         * imprimimr o valor de custo, de venda, e a media de cada valor
         */

        Scanner sc = new Scanner(System.in);

        int cont = 0;
        double precoVenda, precoCusto, somaVenda = 0, somaCusto = 0, mediaCusto = 0, mediaVenda = 0;

        while (cont < 2) {
            System.out.print("Digite o valor de custo do produto: ");
            precoCusto = sc.nextDouble();
            System.out.print("Digite o valor de venda do produto: ");
            precoVenda = sc.nextDouble();

            System.out.printf("Preco de custo: R$%.2f \n", precoCusto);
            System.out.printf("Preco de venda: R$%.2f \n", precoVenda);

            if (precoCusto > precoVenda) {
                System.out.println("Houve prejuízo na venda do produto!");
            } else if (precoCusto < precoVenda) {
                System.out.println("Houve lucro na venda do produto!");
            } else {
                System.out.println("Houve empate nos valores de custo e venda!");
            }

            somaVenda += precoVenda;
            somaCusto += precoCusto;

            cont++;
        }

        mediaCusto = somaCusto / 2;
        mediaVenda = somaVenda / 2;

        System.out.printf("Media dos precos de custo: R$%.2f \n", mediaCusto);
        System.out.printf("Media dos precos de venda: R$%.2f \n", mediaVenda);
    }
}
