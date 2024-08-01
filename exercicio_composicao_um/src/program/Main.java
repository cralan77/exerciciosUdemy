package program;/*
* Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
o instante do sistema: new Date()
* */

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente");

        System.out.print("Nome: ");
        String name = sc.next();

        System.out.print("Email: ");
        String email=sc.next();

        System.out.print("Data de aniversário (DD/MM/AAAA): ");
        String birthDate= sc.next();

        SimpleDateFormat dateFormated = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do pedido: ");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        System.out.print("Quantos itens deseja inserir: ");
        int quantityItems =sc.nextInt();

        Date date = new Date();

        Order order = new Order(date, status, new Client(name, email, dateFormated.parse(birthDate)) );

        for(int i = 1; i<= quantityItems; i++){
            System.out.println("Digite os dados do "+i+"º produto:");

            System.out.print("Nome do produto: ");
            String productName = sc.next();

            System.out.print("Valor do produto: ");
            Double priceProduct = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantityProduct = sc.nextInt();

            order.addItem(new OrderItem(quantityProduct, priceProduct, new Product(productName, priceProduct)));

        }

        System.out.println("Pedido:");
        System.out.println(order.toString());

        sc.close();

    }
}