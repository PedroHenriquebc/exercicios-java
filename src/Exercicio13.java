import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //ler um numero
        //calcular se é maior que 10
        //escrever mensagem se for maior que 10

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num > 10){
            System.out.println("O número é maior que 10!");
        }

    }
}
