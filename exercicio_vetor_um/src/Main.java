/*
* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
* */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoVetor=11;

        while(tamanhoVetor>10) {
            System.out.println("Digite o tamanho do vetor (maximo 10): ");
            tamanhoVetor=sc.nextInt();
        }

        int []lista = new int[tamanhoVetor];

        for(int i=0; i<tamanhoVetor; i++){

            System.out.printf("Digite o %d numero: \n", i+1);
            lista[i]=sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i=0; i<tamanhoVetor; i++){
            if(lista[i]<0){
                System.out.println(lista[i]);
            }
        }

        sc.close();

    }
}