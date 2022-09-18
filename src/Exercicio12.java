import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //ler custo de fabrica
        //calcular o custo total
          //imposto é aplicado ao custo de fabrica
          //depois o percentual do distribuidor em cima
          //custo total = custo de fabrica + percentual + impostos
        //escrever o custo total

        Scanner sc = new Scanner(System.in);
        double percentual = 0.28;
        double imposto = 0.45;
        double custo;

        System.out.print("Digite o custo de fábrica do carro: ");
        custo = sc.nextDouble();

        custo = custo + (custo * imposto);
        custo = custo + (custo * percentual);

        System.out.printf("O custo final do carro é R$%.2f", custo);
    }
}
