/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/
import java.util.*;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		double PI = 3.14159;
		
		System.out.print("Digite o valor do Raio: ");
		raio = sc.nextDouble();
		
		area=PI*Math.pow(raio, 2);
		
		System.out.printf("\n A area do circulo com base no raio %.2f é: %.2f", raio, area);
		
		
		
		sc.close();
	}

}
