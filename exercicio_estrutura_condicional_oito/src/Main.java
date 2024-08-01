/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

Renda	                        Imposto de Renda
De 0,00 a R$ 2.000,00	        Isento
De R$ 2.000,01 até R$ 3.000,00	8%
De R$ 3.000,01 até R$ 4.500,00	18%
Acima de R$ 4.500,00	        28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.

*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double  salario, valorTributavel, imposto=0;

        double[][] tabelaAliquota;
        tabelaAliquota = new double[4][3];
        tabelaAliquota[0][0]=0.00;
        tabelaAliquota[0][1]=2000.00;
        tabelaAliquota[0][2]=0;
        tabelaAliquota[1][0]=2000.01;
        tabelaAliquota[1][1]=3000.00;
        tabelaAliquota[1][2]=8;
        tabelaAliquota[2][0]=3000.01;
        tabelaAliquota[2][1]=4500.00;
        tabelaAliquota[2][2]=18;
        tabelaAliquota[3][0]=4500.01;
        tabelaAliquota[3][1]=987654321.00;
        tabelaAliquota[3][2]=28;

        System.out.print("Digite o valor do salário: ");
        salario=sc.nextDouble();

        for (int i=0; i<4;i++){
            if(salario>tabelaAliquota[i][0] && salario<=tabelaAliquota[i][1]){
                for(int j=i; j>=0;j--){
                    if(salario-tabelaAliquota[j][1]>=0){
                        valorTributavel=salario-(salario-tabelaAliquota[j][1]+0.01)-tabelaAliquota[j][0];
                        imposto+=(valorTributavel*tabelaAliquota[j][2])/100;
                    }else{
                        valorTributavel=salario-tabelaAliquota[j][0]+0.01;
                        imposto+=(valorTributavel*tabelaAliquota[j][2])/100;
                    }
                }


            }
        }
        System.out.printf("O imposto a ser pago é: %.2f",imposto);


        sc.close();
    }
}