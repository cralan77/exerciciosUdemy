package entities;

public class Product {
    private String name;
    private Double amount;
    private int quantity;

    public Product(String name, Double amount, int quantity) {
        this.name = name;
        this.amount = amount;
        this.quantity = quantity;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public Double getamount() {
        return amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalAmount(){
        return amount*quantity;
    }

}
