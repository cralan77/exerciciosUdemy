package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/yyyy");

    private void checkDate(Date checkin, Date checkout) throws DomainException{
        Date now = new Date();
        if(checkin.before(now) || checkout.before(now)){
            throw new DomainException("Erro: Alguma das datas reserva é anterior a data atual.");
        }
        if(!checkout.after(checkin)){
            throw new DomainException("Erro: A data de Check-in é posterior a data de Check-out");
        }
    }

    public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException {
        checkDate(checkin, checkout);
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }


    public Date getCheckin() {
        return checkin;
    }


    public Date getCheckout() {
        return checkout;
    }

    public long duration(){
        long dif = checkout.getTime()-checkin.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);

    }

    public void updateDates(Date checkin, Date checkout) throws DomainException{
       checkDate(checkin, checkout);
        this.checkin=checkin;
        this.checkout=checkout;
    }

    @Override
    public String toString() {
        return "Reservation: Room " + roomNumber + ", check-in: "+ sdf.format(checkin) + ", check-out: "+ sdf.format(checkout) + ", "+duration()+" days";
    }
}
