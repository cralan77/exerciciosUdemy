package program;

import entities.Company;
import entities.Individual;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberTaxPayers;

        System.out.print("Enter the number of tax payers: ");
        numberTaxPayers = sc.nextInt();

        List<Person> person = new ArrayList<>();

        for(int i=1; i<=numberTaxPayers; i++){
            System.out.println("Tax payer #"+i+" data:");

            System.out.print("Individual or company (i/c)? ");
            String personType= String.valueOf(sc.next().charAt(0));
            sc.nextLine();

            System.out.print("Name: ");
            String name= sc.nextLine();

            System.out.print("Anual income: ");
            Double anualIncome=sc.nextDouble();

            if(personType.equals("i")){
                System.out.print("Health expenditures: ");
                Double healthExpenditures=sc.nextDouble();
                person.add(new Individual(name, anualIncome, healthExpenditures));
            }else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees=sc.nextInt();
                person.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();

        System.out.println("TAXES PAID: ");
        double totalTaxes=0;

        for(Person p : person){
            totalTaxes+=p.TaxPaid();
            System.out.println(p);
        }

        System.out.println("TOTAL TAXES: $ "+totalTaxes);

        sc.close();

    }
}