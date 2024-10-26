import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {


        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        DisplayAccount.displayAccount(account1);
        DisplayAccount.displayAccount(account2);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = sc.nextDouble();
        System.out.printf("%n adding %.2f to account1 balance %n%n", depositAmount);

        account1.deposit(depositAmount);
        DisplayAccount.displayAccount(account1);
        DisplayAccount.displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");

        depositAmount = sc.nextDouble();

        System.out.printf("%n adding %.2f to account2 balance %n%n", depositAmount);

        account2.deposit(depositAmount);

        DisplayAccount.displayAccount(account1);
        DisplayAccount.displayAccount(account2);

        System.out.print("Digite o valor que deseja sacar da conta 1: ");
        double value= sc.nextDouble();

        String result = account1.withdraw(value);

        System.out.printf("%s, o valor atual  da conta 1 e: %.2f", result, account1.getBalance());
    }
}