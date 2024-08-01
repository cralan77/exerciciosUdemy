/*
* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
* */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanhoVetor;

        System.out.println("Digite a quantidade de numeros: ");
        tamanhoVetor = sc.nextInt();

        int [] vetor = new int[tamanhoVetor];

        for (int i=0; i<tamanhoVetor; i++){
            System.out.printf("\n Digite o %dº numero: ", i+1);
            vetor[i]=sc.nextInt();
        }

        int resultadoSoma=0;

        for(int i=0; i<tamanhoVetor; i++){
            resultadoSoma +=vetor[i];
        }

        System.out.println("O resultado da soma é: "+resultadoSoma);
        System.out.println("A média é: "+ resultadoSoma/tamanhoVetor);

        sc.close();
    }
}