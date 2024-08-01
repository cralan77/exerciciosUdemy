/*
* Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
* */

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int quantidadeNumeros=sc.nextInt();

        int [] vetorA = new int[quantidadeNumeros];
        int [] vetorB = new int[quantidadeNumeros];
        int [] vetorC = new int[quantidadeNumeros];

        for(int i=0; i<quantidadeNumeros; i++){
            System.out.println("Digite o "+(i+1)+"º numero do vetor A: ");
            vetorA[i] = sc.nextInt();
        }

        for (int i=0; i<quantidadeNumeros; i++){
            System.out.println("Digite o "+(i+1)+"º numero do vetor B: ");
            vetorB[i]= sc.nextInt();
        }

        for(int i=0; i<quantidadeNumeros; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        for(int i=0; i<quantidadeNumeros; i++){
            System.out.println(vetorC[i]);
        }
        sc.close();
    }
}