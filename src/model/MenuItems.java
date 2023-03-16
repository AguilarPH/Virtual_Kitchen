package model;

public enum MenuItems {
    FRIED_CHICKEN("Fried Chicken", 135.75),
    CHEESE_BURGER("Cheese Burger",120.25),
    BABY_RIBS("Baby Ribs",185.9),
    FRENCH_FRIES("French Fries",47.5),
    MILKSHAKE("Milkshake",40.15),
    VANILLA_FLOAT("Vanilla Float", 50.33);

    private String name;
    private double price;

    MenuItems(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
