/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos
 * */
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, resultado;
		
		System.out.print("Digite o primeiro numero inteiro: ");
		primeiroNumero = sc.nextInt();
		
		System.out.print("\n Digite o segundo numero inteiro: ");
		segundoNumero = sc.nextInt();
		
		resultado = primeiroNumero + segundoNumero;
		
		System.out.printf("\n O Resultado da soma é: %d", resultado);
		
		sc.close();
	}

}
