/*
* Fazer um programa para ler os dados de uma conta bancária e depois realizar um
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta. Implemente a conta bancária conforme projeto abaixo:
* */

package program;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite os dados da conta: ");

            System.out.print("Numero: ");
            int accountNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Saldo inicial: ");
            Double initialBalance = sc.nextDouble();

            System.out.print("Limite de saque: ");
            Double withDrawLimit = sc.nextDouble();

            Account account = new Account(accountNumber, name, initialBalance, withDrawLimit);

            System.out.println();

            System.out.print("Digite o valor que deseja sacar: ");
            Double withDraw = sc.nextDouble();

            account.withdraw(withDraw);

            System.out.printf("Saldo disponivel: %.2f",account.getBalance());

        }
        catch (RuntimeException e){
            System.out.print("Erro inesperado, não foi possível realizar abertura da conta");
        }
        catch (DomainException e){
            System.out.print("Erro: "+e.getMessage());
        }


        sc.close();
    }
}