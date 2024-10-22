import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {


        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = sc.nextDouble();
        System.out.printf("%n adding %.2f to account1 balance %n%n", depositAmount);

        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f %n%n", account2.getName(),account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");

        depositAmount = sc.nextDouble();

        System.out.printf("%n adding %.2f to account2 balance %n%n", depositAmount);

        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(),account1.getBalance());

        System.out.printf("%s balance: $%.2f %n%n", account2.getName(),account2.getBalance());

        System.out.print("Digite o valor que deseja sacar: ");
        double value= sc.nextDouble();

        String result = account1.withdraw(value);

        System.out.printf("%s, o valor atual em conta e: %.2f", result, account1.getBalance());
    }
}