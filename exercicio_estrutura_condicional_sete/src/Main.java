/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Digite o valor para X: ");
        x=sc.nextDouble();

        System.out.print("\nDigite o valor para Y: ");
        y=sc.nextDouble();

        String quadrante="";

        //Analise dos quadrantes

        if(x>0 && y>0){
            quadrante="Q1";
        } else if (x>0 && y<0) {
            quadrante="Q4";
        } else if (x==0) {
            quadrante="Eixo X";
        } else if (x<0 && y>0) {
            quadrante="Q2";
        } else if (x<0 && y<0) {
            quadrante="Q3";
        } else if (y==0) {
            quadrante = "Eixo Y";
        }

        System.out.printf("O ponto pertence ao quadrante: %s",quadrante);

        sc.close();

    }
}