package entities;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance){
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;
    }


    public String toString(){
        return "Account: "+ accountNumber+
                "\n Holder: "+ name +
                "\n Balance: "+ balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double value){
        double tax=5.00;
        balance-=value+tax;
    }
    public void deposit(double value){
        balance+=value;
    }
}
