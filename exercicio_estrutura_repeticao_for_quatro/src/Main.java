/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nTestes;
        System.out.println("Digite o numero de testes: ");
        nTestes=sc.nextInt();
        
        int [][] divisao= new int[nTestes][3];
        
        for(int i=0;i<nTestes;i++){
            for(int j=0;j<2;j++){
                System.out.printf("Digite o %d° numero do %d° teste: ",j+1,i+1);
                divisao[i][j]=sc.nextInt();
                if(j==1){
                    if(divisao[i][1]!=0){
                        divisao[i][2]=divisao[i][0]/divisao[i][1];
                        System.out.printf("\nO resultado da divisao e: %d\n\n",divisao[i][2]);
                    }else{
                        System.out.println("Impossivel dividir por zero!");
                    }
                }
            }
        }
        sc.close();
    }
    
}