package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer number;
    private Date date;
    private Double totalValue;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private List<installment> installments = new ArrayList<>();

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDate() {
        return sdf.format(date);
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public List<installment> getInstallments() {
        return installments;
    }

    public void setInstallments(Date date, Double amount) {

        this.installments.add(new installment(date, amount));
    }

    @Override
    public String toString() {
        StringBuilder printInstallments = new StringBuilder();
        for(installment x : installments){
            printInstallments.append(x.getDueDate()).append(" - ").append(x.getAmount()).append("\n");
        }
        return
                "Numero do contrato: "+ getNumber()+"\n"
                + "Data: "+ getDate()+"\n"
                + "Valor do contrato: "+getTotalValue()+"\n"
                + "Parcelas: " +"\n"
                + printInstallments;

    }
}
