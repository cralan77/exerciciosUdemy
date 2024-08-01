/*
* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, primeiroResultado, segundoResultado;

        System.out.println("Digite um numero positivo: ");
        n=sc.nextInt();

        if(n>0){
            for(int i=1; i<=n; i++){
                primeiroResultado=i*i;
                segundoResultado=i*i*i;
                System.out.printf("%d %d %d\n", i, primeiroResultado, segundoResultado);
            }
        }else{
            System.out.println("Numero digitado invalido");
        }

        sc.close();
    }
}