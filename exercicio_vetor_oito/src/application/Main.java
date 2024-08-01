package application;/*
* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).

* */

import entities.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de alunos: ");
        int quantidadeAlunos = sc.nextInt();

        Aluno [] aluno = new Aluno[quantidadeAlunos];


        for(int i=0; i<quantidadeAlunos; i++){
            String nome;
            double notaUm;
            double notaDois;

            System.out.println("Digite o nome do aluno: ");
            nome = sc.next();

            System.out.println("Digite a primeira nota: ");
            notaUm = sc.nextDouble();

            System.out.println("Digite a segunda nota: ");
            notaDois = sc.nextDouble();

            aluno[i] = new Aluno(nome, notaUm, notaDois);

        }
        System.out.println("Alunos aprovados: ");
        for(int i=0; i<quantidadeAlunos; i++){
            if(aluno[i].media()>=6){
                System.out.println(aluno[i].toString());
            }
        }

        sc.close();

    }
}