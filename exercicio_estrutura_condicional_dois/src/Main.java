/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero=sc.nextInt();

        if(numero <0 ){
            System.out.println("Esse numero é NEGATIVO");
        }else{
            System.out.println("Esse numero é POSITIVO");
        }


        sc.close();
    }
}