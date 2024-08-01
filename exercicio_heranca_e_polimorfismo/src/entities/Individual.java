package entities;

public class Individual extends Person {
    private Double healthSpending;

    public Individual(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public Double TaxPaid() {

        if(super.getAnnualIncome()<20000.00){
            return super.getAnnualIncome()*15/100-this.healthSpending*0.5;
        }else{
            return super.getAnnualIncome()*25/100-this.healthSpending*0.5;
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
