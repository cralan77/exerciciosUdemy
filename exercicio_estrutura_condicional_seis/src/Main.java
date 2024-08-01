/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] intervalos;

        intervalos = new double[4][2];

        intervalos[0][0]=0;
        intervalos[0][1]=25;
        intervalos[1][0]=25;
        intervalos[1][1]=50;
        intervalos[2][0]=50;
        intervalos[2][1]=75;
        intervalos[3][0]=75;
        intervalos[3][1]=100;

        double numeroDigitado;

        System.out.println("Digite um número: ");
        numeroDigitado = sc.nextDouble();

        if(numeroDigitado>=0 && numeroDigitado <=100){
            for (int i=0; i<4;i++){
                if ( (numeroDigitado==0 && numeroDigitado==intervalos[i][0]) ||
                        (numeroDigitado>intervalos[i][0] && numeroDigitado<=intervalos[i][1])){
                    System.out.printf("O numero digitado: %.2f esta dentro do intervalo %.2f e %.2f", numeroDigitado, intervalos[i][0], intervalos[i][1]);
                }
            }
        }

        sc.close();
    }
}