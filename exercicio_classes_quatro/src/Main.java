import util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price, quantit;

        System.out.println("Digite o valor do dolar: ");
        price=sc.nextDouble();

        System.out.println("Digita a quantidade de dolares");
        quantit=sc.nextDouble();

        System.out.printf("O valor pago em reais na conversão é: %.2f", CurrencyConverter.Convert(price, quantit));


        sc.close();

    }
}