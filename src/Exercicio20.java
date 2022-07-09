import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ano;
        int totalSemiNovos= 0;
        int totalCarros = 0;
        double valor, desconto, valorFinal;
        boolean flag = true;
        String continuar;

        while (flag) {
            System.out.print("Digite o ano do carro: ");
            ano = sc.nextInt();

            System.out.print("Digite o valor do carro: ");
            valor = sc.nextDouble();

            if (ano <= 2000) {
                desconto = valor * 0.12;
                valorFinal = valor - desconto;
                totalSemiNovos += 1;
            } else {
                desconto = valor * 0.07;
                valorFinal = valor - desconto;
            }

            totalCarros += 1;

            System.out.printf("Desconto: R$%.2f %n", desconto);
            System.out.printf("Valor final a ser pago: R$%.2f %n", valorFinal);
            System.out.print("Deseja continuar (S/N)? ");
            continuar = sc.next();

            if (continuar.equalsIgnoreCase("n")) {
                flag = false;
            }
        }

        System.out.print("Total de carros: " + totalCarros);
        System.out.println();
        System.out.print("Total de carros com ano até 2000: " + totalSemiNovos);

    }
}
