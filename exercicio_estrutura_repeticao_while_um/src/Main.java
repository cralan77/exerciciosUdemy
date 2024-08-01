/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i=1, senhaCorreta=2002, senhaDigitada=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        senhaDigitada=sc.nextInt();

        while(senhaDigitada!=senhaCorreta){
            System.out.println("Senha inválida!");

            System.out.println("Digite a senha novamente: ");
            senhaDigitada=sc.nextInt();
            i++;
        }

        System.out.printf("Senha correta, acesso liberado, houveram %d tentativas", i);
        sc.close();
    }
}