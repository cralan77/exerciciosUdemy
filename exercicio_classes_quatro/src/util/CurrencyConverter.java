package util;

public class CurrencyConverter {
    private static double Iof(double grossValue){
        double PERCENTUAL=6;
        return grossValue+(grossValue*PERCENTUAL/100);
    }

    public static double Convert(double price, double quantit){
        double result;
        result=price*quantit;
        return Iof(result);
    }
}
