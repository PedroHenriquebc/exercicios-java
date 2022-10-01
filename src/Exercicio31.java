import java.util.Scanner;

/**
 * ler a, b e c(a e b reais e c string)
 * imprimir o resultado da operacao a c b se c for um simbolo aritmetico
 * obs: tratar erro de divisao por zero e operador indefinido
 */
public class Exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;
        String c;

        System.out.print("Digite o primeiro numero: ");
        a = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        b = sc.nextDouble();
        System.out.print("Digite a operacao(-, +, *, / : ");
        c = sc.next();

        if (c.equals("+")) {
            System.out.printf("Soma: %.2f + %.2f = %.2f", a, b, a+b);
        } else if (c.equals("-")) {
            System.out.printf("Subtracao: %.2f - %.2f = %.2f", a, b, a-b);
        } else if (c.equals("*")) {
            System.out.printf("Multiplicacao: %.2f * %.2f = %.2f", a, b, a*b);
        } else if (c.equals("/")) {
            if (a == 0 || b == 0) {
                System.out.println("Nao existe divisao por zero!");
            } else {
                System.out.printf("Divisao: %.2f / %.2f = %.2f", a, b, a/b);
            }
        } else {
            System.out.println("Operador aritimetico invalido!");
        }
    }
}
