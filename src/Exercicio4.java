import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        double salarioFixo = 0, salarioFinal = 0, vendas = 0;
        double comissao = 0.15;

        System.out.print("Informe seu nome: ");
        nome = sc.next();

        System.out.print("Informe seu salário fixo: ");
        salarioFixo = sc.nextDouble();

        System.out.print("Informe o total de vendas efetuadas em dinheiro: ");
        vendas = sc.nextDouble();

        salarioFinal = salarioFixo + (vendas * comissao);

        System.out.printf("Nome: %s %n", nome);
        System.out.printf("Salário fixo: R$%.2f %n", salarioFixo);
        System.out.printf("Salário final: R$%.2f %n", salarioFinal);

    }
}
