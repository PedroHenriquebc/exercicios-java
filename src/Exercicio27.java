import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        /**
         * ler o valor do veiculo
         * calcular o valor do desconto e o valor a ser pago
         * exibir o valor do desconto,o valor a ser pago, o total de descontos e o total pago pelos clientes
         */

        Scanner sc = new Scanner(System.in);

        double valorVeiculo = 1, valorDesconto, valorFinal, totalDesconto = 0, totalFinal = 0;
        String combustivel;

        System.out.print("Digite o valor do veiculo: ");
        valorVeiculo = sc.nextDouble();

        while (valorVeiculo != 0) {
            System.out.print("Qual o tipo de combustivel(alcool, gasolina ou diesel): ");
            combustivel = sc.next();

            if (combustivel.equalsIgnoreCase("alcool")) {
                valorDesconto = valorVeiculo * 0.25;
            } else if (combustivel.equalsIgnoreCase("gasolina")) {
                valorDesconto = valorVeiculo * 0.21;
            } else {
                valorDesconto = valorVeiculo * 0.14;
            }

            valorFinal = valorVeiculo - valorDesconto;
            totalDesconto += valorDesconto;
            totalFinal += valorFinal;

            System.out.printf("O valor do desconto e R$%.2f \n", valorDesconto);
            System.out.printf("O valor a ser pago e R$%.2f \n", valorFinal);

            System.out.print("Digite o valor do veiculo: ");
            valorVeiculo = sc.nextDouble();
        }

        System.out.printf("O total de descontos foi de R$%.2f \n", totalDesconto);
        System.out.printf("O total pago pelos clientes foi de R$%.2f \n", totalFinal);
    }
}
