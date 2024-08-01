/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
1-Cachorro Quente-4,00
2-X-Salada-4,50
3-X-Bacon-5,00
4-Torrada Simples-2,00
5-Refrigerante-1,50

*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Declarado Matriz, porém nesse nível do curso ainda não haviamos introduzido o uso de matrizes.
        double[][] produtos;
        produtos = new double[5][2];

        produtos[0][0]=1;
        produtos[0][1]=4.00;
        produtos[1][0]=2;
        produtos[1][1]=4.50;
        produtos[2][0]=3;
        produtos[2][1]=5.00;
        produtos[3][0]=4;
        produtos[3][1]=2.00;
        produtos[4][0]=5;
        produtos[4][1]=1.50;

        double codigProduto, quantidadeProduto, total=0;

        System.out.print("Digite o código do produto: \n");
        codigProduto = sc.nextDouble();

        System.out.print("Digite a quantidade de produtos: \n");
        quantidadeProduto=sc.nextDouble();

        if(codigProduto<6){
            for(int i=0;i<5;i++) {
                if (produtos[i][0] == codigProduto) {
                    total = quantidadeProduto * produtos[i][1];
                }
            }
            System.out.printf("O total em R$ é: %.2f", total);
        }else{
            System.out.print("Código inválido.");
        }



        sc.close();
    }
}