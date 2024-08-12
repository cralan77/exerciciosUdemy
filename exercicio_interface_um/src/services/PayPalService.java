package services;

public class PayPalService implements OnlinePaymentService{

    public Double paymentFee(Double amount){
        Double tax = 0.02;
        return amount*tax;
    }

    public Double interest(Double amount, Integer months){
        Double tax = 0.01;
        return amount * tax*months;
    }
}
