/*
 Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 
 */

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigoProdutoUm, quantidadeProdutoUm,  codigoProdutoDois, quantidadeProdutoDois;
		double valorProdutoUm, valorProdutoDois, total;
		
		System.out.print("Digite o código do primeiro produto: ");
		codigoProdutoUm = sc.nextInt();
		
		System.out.print("\nDigite a quantidade de pecas do primeiro produto: ");
		quantidadeProdutoUm = sc.nextInt();
		
		System.out.print("\nDigite o valor do primeiro produto: ");
		valorProdutoUm = sc.nextDouble();
		
		System.out.print("\nDigite o código do segundo produto: ");
		codigoProdutoDois=sc.nextInt();
		
		System.out.print("\nDigite a quantidade de pecas do segundo produto: ");
		quantidadeProdutoDois = sc.nextInt();
		
		System.out.print("\nDigite o valor do segundo produto: ");
		valorProdutoDois = sc.nextDouble();
		
		total = (quantidadeProdutoUm*valorProdutoUm)+(quantidadeProdutoDois*valorProdutoDois);
		
		System.out.printf("\nO valor total de sua compra é %.2f", total);
		
		sc.close();
		
	}

}
