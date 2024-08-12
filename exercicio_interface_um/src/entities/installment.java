package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class installment {
    private Date dueDate;
    private Double amount;

    private  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy" );

    public installment(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public String getDueDate() {
        return sdf.format(dueDate);
    }

    public Double getAmount() {
        return amount;
    }

}
