package model;

import java.util.*;

public class Meal {

    private int id;
    private String name;
    private double price;
    private Map<Integer, Double> ingredients;

    Meal(String name, double price) {
        setName(name);
        setPrice(price);
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

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setIngredients(Map<Integer, Double> ingredients) {
        this.ingredients.putAll(ingredients);
    }

    public Map<Integer, Double> getIngredients() {
        return ingredients;
    }

    public boolean isAvailable() {
        return true;
    }

}
