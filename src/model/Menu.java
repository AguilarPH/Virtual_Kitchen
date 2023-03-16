package model;

public class Menu {

    public static final String MAIN_DISH = "Main";
    public static final String SIDE_DISH = "Side Dish";
    public static final String SOFT_DRINK = "Soft Drink";

    private String name;
    private double price;
    private String plateType;

    public Menu(MenuItems item, String plateType) {
        this.name = item.getName();
        this.price = item.getPrice();
        this.plateType = plateType;
    }

    public void setName(MenuItems name) {
        this.name = name.getName();
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPlateType(String plate) {
        this.plateType = plate;
    }

    public String getPlateType() {
        return plateType;
    }
}
