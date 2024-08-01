/*
 Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B
*/
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, PI=3.14159;
		
		
		System.out.print("Digite o primeiro valor: ");
		a=sc.nextDouble();
		
		System.out.print("\nDigite o segundo valor: ");
		b=sc.nextDouble();
		
		System.out.print("\nDigite o terceiro valor: ");
		c=sc.nextDouble();
		
		areaTriangulo=(a*c)/2;
		
		areaCirculo=Math.pow(c, 2)*PI;
		
		areaTrapezio =((a*b)/2)*c;
		
		areaQuadrado = b*b;
		
		areaRetangulo = a*b;
		
		System.out.printf("A area do triangulo é: %.2f\n", areaTriangulo);
		
		System.out.printf("A area do circulo é: %.2f\n", areaCirculo);
		
		System.out.printf("A area do trapezio é: %.2f\n", areaTrapezio);
		
		System.out.printf("A area do quadrado é: %.2f\n", areaQuadrado);
		
		System.out.printf("A area do retangulo é: %.2f\n", areaRetangulo);
		
		
		
		
		sc.close();
		
	}

}
