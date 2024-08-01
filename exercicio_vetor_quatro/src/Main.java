/*
* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
* */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int quantidadeNumeros=sc.nextInt();

        int [] vetor = new int [quantidadeNumeros];
        int quantidadePar=0;
        StringBuilder numerosPares= new StringBuilder();
        for(int i=0; i<quantidadeNumeros; i++){
            System.out.println("Digite o "+(i+1)+"º numero:");
            vetor[i]=sc.nextInt();
            if(vetor[i]%2==0){
                quantidadePar++;
                numerosPares.append(vetor[i]).append("\n");
            }
        }

        System.out.println("Quantidade de numeros pares: "+ quantidadePar);
        System.out.println("Numeros Pares: \n"+numerosPares);


        sc.close();

    }
}