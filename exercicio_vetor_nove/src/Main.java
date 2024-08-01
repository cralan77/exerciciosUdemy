/*
* Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas: ");
        int quantidadePessoas = sc.nextInt();

        double maiorAltura=0, menorAltura=10, mediaAlturaMulheres=0, quantidadeHomens=0;


        for(int i=0; i<quantidadePessoas; i++){
            String sexo;
            double altura;

            System.out.println("Digite o sexo da pessoa: ");
            sexo = sc.next();

            System.out.println("Digite a altura da pessoa: ");
            altura = sc.nextDouble();

            if(altura>maiorAltura){
                maiorAltura=altura;
            }

            if(altura<menorAltura){
                menorAltura = altura;
            }
            if(sexo.equals("F")){
                mediaAlturaMulheres+=altura;
            }else{
                quantidadeHomens++;
            }

        }

        mediaAlturaMulheres = mediaAlturaMulheres/(quantidadePessoas-quantidadeHomens);

        System.out.println("A maior altura é: "+maiorAltura);
        System.out.println("A menor altura é:"+menorAltura);
        System.out.printf("A média de altura das mulheres é: %.2f",mediaAlturaMulheres);
        System.out.println("A quantidade de homens é: "+quantidadeHomens);

        sc.close();
    }
}