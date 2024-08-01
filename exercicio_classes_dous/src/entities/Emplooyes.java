package entities;

public class Emplooyes {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary-tax;
    }

    public void IncreaseSalary(double percentagem){
        grossSalary= grossSalary+grossSalary*percentagem/100;
    }
}
