import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        //ler valor em dolar, cotação do dolar

        //calcular o valor em real

        //mostrar o valor em da conversão em Real

        Scanner sc = new Scanner(System.in);
        double dolar = 0, real = 0, cotacaoDolar = 0;

        System.out.print("Informe o valor em dólar: $");
        dolar = sc.nextDouble();

        System.out.print("Informe a cotação do dólar: R$");
        cotacaoDolar = sc.nextDouble();

        real = cotacaoDolar * dolar;

        System.out.printf("$%.2f convertido em Real é R$%.2f", dolar, real);
    }
}
