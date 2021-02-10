package edu.wctc;

public class Product extends Asset implements Sellable {
    private int quantity;

    public Product(String sku, String product, Double price, int quantity) {
        super(sku, product, price);
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
        return String.format("Product Name: %s\nProduct Cost: $%s\nUnits in Stock: %s", getIdentity(), getValue(), getQuantity());
    }
}
