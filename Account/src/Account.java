public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name=name;

        if(balance>0.0){
            this.balance=balance;
        }
    }

    public String withdraw(double value){

        if(value>balance){
            return "Withdraw amount exceeded account balance";
        }else{
            balance -= value;
            return "Sucess";
        }

    }

    public void deposit(double depositAmount){
        if(depositAmount>0.0){
            balance += depositAmount;
                    }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }
}
