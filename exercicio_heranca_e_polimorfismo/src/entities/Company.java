package entities;

public class Company extends Person {
    private Integer employeeNumber;

    public Company(String name, Double annualIncome, Integer employeeNumber) {
        super(name, annualIncome);
        this.employeeNumber = employeeNumber;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public Double TaxPaid() {
        if(employeeNumber>10){
            return super.getAnnualIncome()*14/100;
        }else{
            return super.getAnnualIncome()*16/100;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
