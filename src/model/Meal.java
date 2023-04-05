package model;

import java.util.HashMap;
import java.util.Map;

public enum Meal {
     FRIED_CHICKEN("Fried Chicken", 135.75, friedChicken_ingredients()),
    CHEESE_BURGER("Cheese Burger",120.25, cheeseBurger_Ingredients()),
    BABY_RIBS("Baby Ribs",185.9, babyRibs_Ingredients()),
    FRENCH_FRIES("French Fries",47.5, frenchFries_Ingredients()),
    MILKSHAKE("Milkshake",40.15, milkshake_Ingredients()),
    VANILLA_FLOAT("Vanilla Float", 50.33, vanillaFloat_Ingredients());

    private String name;
    private double price;

    private Map<Ingredient, Double> ingredients = new HashMap<>();

    Meal(String name, double price, Map<Ingredient, Double> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients.putAll(ingredients);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Map<Ingredient, Double> getIngredients() {
        return ingredients;
    }

    private static Map<Ingredient, Double> friedChicken_ingredients() {
        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(Ingredient.CHICKEN_PIECE, 3.0);
        ingredients.put(Ingredient.BREAD_CRUMBS_KG, 0.25);
        ingredients.put(Ingredient.EGG, 2.0);
        ingredients.put(Ingredient.OIL_LTR, 0.5);
        ingredients.put(Ingredient.CHICKEN_SEASONING_KG, 0.250);

        return ingredients;
    }

    private static Map<Ingredient, Double> cheeseBurger_Ingredients() {
        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(Ingredient.BURGER_BUNS, 2.0);
        ingredients.put(Ingredient.GROUNDED_MEAT_KG, 0.3);
        ingredients.put(Ingredient.SALT_KG, 0.005);
        ingredients.put(Ingredient.MEAT_SEASONING_KG, 0.05);
        ingredients.put(Ingredient.CHEESE_SLICE, 2.0);
        ingredients.put(Ingredient.SECRET_DRESSING_LTR, 0.125);

        return ingredients;
    }

    private static Map<Ingredient, Double> babyRibs_Ingredients() {
        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(Ingredient.BABY_BACK_RIBS_RACK, 1.0);
        ingredients.put(Ingredient.BBQ_SAUCE_LTR, 0.25);

        return ingredients;
    }

    private static Map<Ingredient, Double> frenchFries_Ingredients() {
        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(Ingredient.POTATOES_KG, 0.3);
        ingredients.put(Ingredient.SALT_KG, 0.03);
        ingredients.put(Ingredient.SPECIAL_SEASONING_KG, 0.1);

        return ingredients;
    }

    private static Map<Ingredient, Double> milkshake_Ingredients() {
        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(Ingredient.MILK_LTR, 0.4);
        ingredients.put(Ingredient.VANILLA_ICECREAM_LTR, 0.2);
        ingredients.put(Ingredient.WHIPPED_CREAM_LTR, 0.125);

        return ingredients;
    }
    private static Map<Ingredient, Double> vanillaFloat_Ingredients() {
        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(Ingredient.ROOT_BEER_LTR, 0.4);
        ingredients.put(Ingredient.VANILLA_ICECREAM_LTR, 0.2);

        return ingredients;
    }



}
