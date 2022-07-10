import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double distancia, combustivel;

        System.out.print("Digite a distância percorrida em Km: ");
        distancia = sc.nextInt();

        System.out.print("Digite a quantidade de combustível gasto em Litros: ");
        combustivel = sc.nextInt();

        System.out.printf("O consumu médio de combustível é de %.2f litros por Km", (combustivel / distancia));
    }
}
