package program;/*
* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
* */

import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadePessoas;

        System.out.println("Digite a quantidade de pessoas: ");
        quantidadePessoas = sc.nextInt();

        Pessoa [] pessoa = new Pessoa[quantidadePessoas];

        String nome;
        int idade;
        double altura;

        for( int i=0; i<quantidadePessoas; i++){
            sc.nextLine();

            System.out.printf("Digite o nome da %dª pessoa: ", i+1);
            nome=sc.nextLine();

            System.out.printf("Digite a idade da %dª pessoa: ", i+1);
            idade=sc.nextInt();

            System.out.printf("Digite a altura da %dª pessoa: ", i+1);
            altura = sc.nextDouble();

            pessoa[i]=new Pessoa(nome, idade, altura);
        }
        double alturaTotal =0;
        int quantidadeAbaixo16=0;
        int percentualAbaixo16;
        StringBuilder resultadoAbaixo16 = new StringBuilder();
        for (int i=0; i<quantidadePessoas; i++){
            alturaTotal +=pessoa[i].getAltura();
            if(pessoa[i].getIdade()<16){
                quantidadeAbaixo16++;
                resultadoAbaixo16.append(pessoa[i].toString()).append("\n");
            }

        }

        System.out.println("Altura média: "+ alturaTotal/quantidadePessoas);

        if(quantidadeAbaixo16>0){
            percentualAbaixo16 = quantidadeAbaixo16*100/quantidadePessoas;
            System.out.println("O percentual de pessoas abaixo de 16 anos é: "+percentualAbaixo16+"%");
            System.out.println("Pessoas abaixo de 16: ");
            System.out.println(resultadoAbaixo16);
        }

        sc.close();
    }
}