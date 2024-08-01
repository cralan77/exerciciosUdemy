/*
 Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais
 
 */

import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario;
		double quantidadeHoras, valorHora, calculoSalario;
		
		System.out.print("Digite o numero do funcionario: ");
		numeroFuncionario = sc.nextInt();
		
		System.out.print("\nDigite a quantidade de horas trabalhadas: ");
		quantidadeHoras = sc.nextDouble();
		
		System.out.print("\nDigite o valor por hora trabalhada: ");
		valorHora = sc.nextDouble();
		
		calculoSalario = quantidadeHoras * valorHora;
		
		System.out.printf("\nO funcionario %d vai receber %.2f de salario", numeroFuncionario, calculoSalario);
		
		sc.close();
	}

}
