/*
*A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
* */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [][] quartos = new String[10][2];
        int quantHospedes;

        System.out.println("Quantas pessoas irão se hospedar? ");
        quantHospedes=sc.nextInt();
        int numeroQuarto;
        for(int i=0;i<quantHospedes; i++){
            System.out.println("Digite o numero do quarto escolhido: ");
            numeroQuarto=sc.nextInt();
            sc.nextLine();

            System.out.printf("Digite o nome do %dº hospede: \n", i+1);
            quartos[numeroQuarto][0]=sc.nextLine();

            System.out.printf("Digite o email do %dº hospede: \n", i+1);
            quartos[numeroQuarto][1]=sc.nextLine();
        }

        for(int i=0; i<10;i++){
            if(quartos[i][0] != null){
                System.out.printf("%d: %s, %s \n", i, quartos[i][0], quartos[i][1]);
            }
        }

        sc.close();

    }
}