package program;/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;

import javax.management.PersistentMBean;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List <Employee> lista = new ArrayList<>();
        int quantidade;

        System.out.println("Digite a quantidade de funcionários: ");
        quantidade = sc.nextInt();
        int id;
        double salary;
        String name;


        for (int i=0; i<quantidade; i++){
            int checkIdDuplicated=0;
            System.out.printf("Digite o id do %d funcionário: \n ", i+1);
            id=sc.nextInt();
            for (Employee x : lista){
                if(x.getId()==id) {
                    checkIdDuplicated=1;
                    break;
                }
            }
            if(checkIdDuplicated !=1){
                sc.nextLine();
                System.out.printf("Digite o nome do %d funcionário: \n", i+1);
                name=sc.nextLine();
                System.out.printf("Digite o salário do %d funcionário: \n", i+1);
                salary=sc.nextDouble();
                lista.add(new Employee(id, name, salary));
            }else{
                System.out.println("ID Digitado já registrado, tente novamente!");
                i--;
            }

        }


        System.out.println("Digite o ID do funcionário que terá aumento de salário: ");
        int idAumento = sc.nextInt();

        System.out.println("Digite o percentual de aumento (Apenas numeros): ");
        double percentual=sc.nextDouble();
        int i=0;
        for(Employee x : lista){
            i++;
            if(x.getId()==idAumento){
                x.salaryChange(percentual);
                break;
            }else{
                if(lista.size()==i){
                    System.out.println("ID não encontrado");
                }
            }
        }

        for(Employee x : lista){
            System.out.println(x.toString());
        }
    }
}