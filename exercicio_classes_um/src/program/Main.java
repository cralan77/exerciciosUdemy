package program;/*
Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.

*/
import entities.Rectangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and heigth: ");
        rectangle.width=sc.nextDouble();
        rectangle.height=sc.nextDouble();

        System.out.printf("Area: %.2f \n", rectangle.Area());
        System.out.printf("Perimetro: %.2f \n", rectangle.Perimeter());
        System.out.printf("Diagonal: %.2f", rectangle.Diagonal());
        sc.close();
    }
}