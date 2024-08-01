/*
 *Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz.
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoMatriz;

        System.out.println("Digite o tamanho da matriz \n" +
                "(o numero digitado será considerado para linhas e colunas)");
        tamanhoMatriz=sc.nextInt();

        int [][]  matriz = new int [tamanhoMatriz][tamanhoMatriz];

        for (int i=0;i<tamanhoMatriz;i++){
            for (int j=0; j<tamanhoMatriz; j++){
                System.out.printf("Digite o numero para posição L: %d C: %d\n", i, j);
                matriz[i][j]=sc.nextInt();
            }
        }
        StringBuilder resultadoDiagonal= new StringBuilder();
        StringBuilder resultadoNegativo= new StringBuilder();

        for( int i=0; i<tamanhoMatriz; i++){
            for(int j=0; j<tamanhoMatriz; j++){
                if(matriz[i][j]<0){
                    resultadoNegativo.append(matriz[i][j]).append(", ");
                }
                if(i==j){
                    resultadoDiagonal.append(matriz[i][j]).append(", ");
                }
            }
        }

        //removendo ultima ", " da Sting
        resultadoDiagonal.deleteCharAt(resultadoDiagonal.length()-2);
        resultadoNegativo.deleteCharAt(resultadoNegativo.length()-2);

        System.out.println("Os numeros presentes na diagonal são: "+ resultadoDiagonal);
        System.out.println("Os numeros negativos são: "+resultadoNegativo);

        sc.close();

    }
}