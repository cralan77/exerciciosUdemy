package services;

import entities.Contract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public void processContract(Contract contract, Integer months) throws ParseException {
        OnlinePaymentService service = new PayPalService();
        Double baseAmount = contract.getTotalValue() / months;
        Date baseDate = sdf.parse(contract.getDate());
        Calendar cal = Calendar.getInstance();

        for(int i=1; i<= months; i++ ){
            Double interest = service.interest(baseAmount, i);
            Double paymentFee= service.paymentFee(baseAmount+interest);
            cal.setTime(baseDate);
            cal.add(Calendar.MONTH,i);
            contract.setInstallments(cal.getTime(), baseAmount+paymentFee+interest);
        }
    }
}
