import java.util.Scanner;

/**
 * ler 3 valores inteiros
 * informar se e um triangulo, se for qual o tipo
 */
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Digite o valor do lado 1: ");
        a = sc.nextInt();
        System.out.print("Digite o valor do lado 2: ");
        b = sc.nextInt();
        System.out.print("Digite o valor do lado 3: ");
        c = sc.nextInt();

        if(a > (b + c) || b > (a + c) || c > (b + a)) {
            System.out.println("Nao e um triangulo!");
        } else if (a == b && b == c) {
            System.out.println("Triangulo equilatero!");
        } else if (a == b || a == c || b == c)  {
            System.out.println("Triangulo isoscele!");
        } else if (a != b && a != c && b != c) {
            System.out.println("Triangulo escaleno!");
        }

    }
}
