package model;

public class Ingredient {

    private int id;
    private String name;
    private double stock;

    Ingredient(String name, double stock) {
        setName(name);
        this.stock = stock;

    }

    private void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStock(double reStocking) {
        this.stock += reStocking;
    }

    public void removeStock(double stockOut) {
        this.stock -= stockOut;
    }

    public double getStock() {
        return stock;
    }

}
