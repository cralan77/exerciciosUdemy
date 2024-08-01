package entities;

public enum OrderStatus {

    PENDING_PAYMENT(0), PROCESSING(1), SHIPPED(2), DELIVERED(3);

    private final int valorEnum;

    OrderStatus(int valorEnum){
        this.valorEnum=valorEnum;
    }

    public int getValorEnum() {
        return valorEnum;
    }
}
