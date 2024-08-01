/*
 Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
 calcule e mostre a diferença do produto de A e B pelo produto de C e D 
 segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.print("Digite o primeiro numero inteiro: ");
		a=sc.nextInt();
		
		System.out.print("\n Digite o segundo numero inteiro: ");
		b=sc.nextInt();
		
		System.out.print("\n Digite o terceiro numero inteiro: ");
		c=sc.nextInt();
		
		System.out.print("\n Digite o quarto numero inteiro: ");
		d=sc.nextInt();
		
		diferenca = (a*b)-(c*d);
		
		System.out.printf("A diferença do produto de A*B-C*D é: %d", diferenca);
		
		sc.close();
	}

}
