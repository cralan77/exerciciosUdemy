public class DisplayAccount {
    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: $%.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
