import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //ler um numero
        //calcular se esta entre 100 e 200
        //escrever se ele está no intervalo

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        if (num > 100 && num < 200) {
            System.out.println("O numero esta no intervalo de 100 e 200!");
        } else {
            System.out.println("O numero NAO esta no intervalo de 100 e 200!");
        }
    }
}
