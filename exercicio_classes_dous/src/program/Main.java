package program;/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.*/


import entities.Emplooyes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emplooyes emp = new Emplooyes();


        System.out.println("Name: ");
        emp.name= sc.nextLine();

        System.out.println("Gross Salary");
        emp.grossSalary = sc.nextDouble();

        System.out.println("Enter Tax: ");
        emp.tax= sc.nextDouble();;

        System.out.printf("Net Salary: %s, %.2f \n", emp.name,emp.NetSalary() );

        System.out.println("Which percentagem to infrease salary ?");
        double percentagem;
        percentagem= sc.nextDouble();;
        emp.IncreaseSalary(percentagem);

        System.out.printf("Updated data: %s, %.2f", emp.name, emp.NetSalary());

        sc.close();
    }
}