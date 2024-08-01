/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo.
*/
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool=0, gasolina=0, diesel=0, digitado=0;
        
        while (digitado != 4){
            System.out.println("Digite o numero do produto (4 para encerrar)");
            digitado=sc.nextInt();
            if(digitado <1 || digitado >4){
                System.out.println("Numero invalido!");
            }else{
                if(digitado==1){
                    alcool+=1;
                    
                }
                if(digitado==2){
                    gasolina+=1;
                }
                if(digitado==3){
                    diesel+=1;
                }
                if(digitado==4){
                    break;
                }
                System.out.println("Produto registrado.");
            }
        }
        System.out.println("Muito Obrigado!");
        System.out.printf("Alcool: %d\n",alcool);
        System.out.printf("Gasolina: %d\n",gasolina);
        System.out.printf("Diesel: %d",diesel);
        sc.close();
    }
    
}