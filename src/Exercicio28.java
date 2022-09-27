import java.util.Scanner;

/**
 * ler nome do funcionario, salario e salario minimo
 * calcular o novo salario reajustado
 * imprimir nome do funcionario o reajuste, o seu novo salario e quanto a empresa vai aumentar sua folha de pagamento
 */
public class Exercicio28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        double salario, salarioMinimo, reajuste, aumento, novoSalario;

        System.out.print("Digite o nome do funcionario: ");
        nome = sc.next();

        System.out.print("Digite o valor do salario minimo: ");
        salarioMinimo = sc.nextDouble();

        System.out.print("Digite o valor do salario do funcionario: ");
        salario = sc.nextDouble();

        if (salario < (salarioMinimo * 3)) {
            reajuste = 0.5;
        } else if (salario >= (salarioMinimo * 3) && salario < (salarioMinimo * 10)) {
            reajuste = 0.2;
        } else if (salario >= (salarioMinimo * 10) && salario < (salarioMinimo * 20)) {
            reajuste = 0.15;
        } else {
            reajuste = 0.1;
        }

        aumento = salario * reajuste;
        novoSalario = salario + aumento;

        System.out.printf("Funcionario: %s \n", nome);
        System.out.printf("Reajuste: %.0f%% \n", reajuste * 100);
        System.out.printf("Novo salario: R$%.2f \n", novoSalario);
        System.out.printf("Valor do aumento: RS%.2f \n", aumento);
    }
}
