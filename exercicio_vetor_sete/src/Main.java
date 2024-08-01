/*
* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int quantidadeNumeros= sc.nextInt();

        double [] vetor = new double[quantidadeNumeros];
        double acumulador=0;

        for(int i=0; i<quantidadeNumeros; i++){
            System.out.println("Digite o "+(i+1)+"º numero: ");
            vetor[i] = sc.nextDouble();
            acumulador+=vetor[i];
        }
        System.out.printf("A média dos numeros digitados é: %.3f", acumulador/quantidadeNumeros);
        System.out.println();
        System.out.println("Numeros abaixo da média: ");
        for(int i=0; i<quantidadeNumeros; i++){
            if(vetor[i]<acumulador/quantidadeNumeros){
                System.out.println(vetor[i]);
            }
        }

        sc.close();

    }
}