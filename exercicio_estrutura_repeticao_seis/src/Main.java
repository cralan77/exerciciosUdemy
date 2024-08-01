/*
*Ler um número inteiro N e calcular todos os seus divisores
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n;

        System.out.println("Digite um numero: ");
        n=sc.nextInt();

        if(n>0) {
            for (int i=n; i>0; i--){
                if(n%i==0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Numero inválido");
        }
        sc.close();

    }
}