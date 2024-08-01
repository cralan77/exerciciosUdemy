/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero: ");
        numero=sc.nextInt();
        if(numero%2==0){
            System.out.print("Este numero é PAR");
        }else{
            System.out.println("Este numero é IMPAR");
        }

        sc.close();
    }
}