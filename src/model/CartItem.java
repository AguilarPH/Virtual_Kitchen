package model;

public class CartItem {

    private int id;
    private Meal meal;
    private int quantity;

    public CartItem(int quantity, Meal meal) {
        this.quantity = quantity;
        this.meal = meal;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public Meal getMeal() {
        return meal;
    }

    public int getQuantity() {
        return quantity;
    }
}
