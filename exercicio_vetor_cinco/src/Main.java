/*
* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
* */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int quantidadeNumeros=sc.nextInt();

        int vetor [] = new int[quantidadeNumeros];
        int maior=0, posicao=0;
        for(int i=0; i<quantidadeNumeros; i++){
            System.out.println("Digite o "+(i+1)+ "º numero: ");
            vetor[i]=sc.nextInt();
            if(vetor[i]>maior){
                maior=vetor[i];
                posicao=i;
            }
        }

        System.out.println("O maior numero digitado foi o: "+maior);
        System.out.println("Presente na posição: "+posicao+" do vetor");
        sc.close();
    }
}