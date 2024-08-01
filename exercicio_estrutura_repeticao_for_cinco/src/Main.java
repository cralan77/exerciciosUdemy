/*
* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, resultado=0;

        System.out.println("Digite o valor que deseja calcular o fatorial");
        n=sc.nextInt();

        if (n<=1){
            resultado=1;
        }else{
            resultado=n;
            for(int i=n-1;i>0;i--){
                resultado=resultado*i;
            }
        }

        System.out.printf("O fatorial de %d é %d", n, resultado);

        sc.close();
    }
}