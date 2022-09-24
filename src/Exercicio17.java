import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        /**
         * ler 80 numeros(?!)
         * calcular quantos estao entre os intervalos 10 e 150 incluindo ambos
         * imprimir a quantidade de numeros
         */

        Scanner sc = new Scanner(System.in);

        int numero;
        int total = 0, cont = 0;

        while (cont < 80){
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            if (numero >= 10 && numero <= 150){
                total ++;
            }
            cont++;
        }

        System.out.printf("O total de numeros entre o intervalo 10 e 150 é: %d", total);
    }
}
