/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
peso 5.
*/
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Digite um numero inteiro: ");
        n=sc.nextInt();
        
        double [][] numeros = new double [n][4];
        
            
        for(int i=0; i<n;i++){
            for(int j=0; j<3;j++){
                System.out.printf("Digite o %d° numero do %d° conjunto: ", j+1, i+1);
                numeros[i][j]=sc.nextDouble();
                if(j==2){
                    numeros[i][3]=(numeros[i][0]*2+numeros[i][1]*3+numeros[i][2]*5)/10;
                    System.out.printf("%.1f \n", numeros[i][3]);
                }
            }
            
        }
        
        sc.close();
    }
    
}