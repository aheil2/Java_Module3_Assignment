package edu.wctc;

public class Product extends Asset implements Sellable {
    private int quantity;

    public Product(String sku, String product, Double price, int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public boolean isAvailable(int quantity) {
        return true;
    }

    @Override
    public String toString() {
        return String.format("");
    }
}
