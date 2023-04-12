package model;

import java.util.HashMap;
import java.util.Map;

public enum MealsExamples {
    FRIED_CHICKEN("Fried Chicken", 135.75, friedChicken_ingredients()),
    CHEESE_BURGER("Cheese Burger",120.25, cheeseBurger_Ingredients()),
    BABY_RIBS("Baby Ribs",185.9, babyRibs_Ingredients()),
    FRENCH_FRIES("French Fries",47.5, frenchFries_Ingredients()),
    MILKSHAKE("Milkshake",40.15, milkshake_Ingredients()),
    VANILLA_FLOAT("Vanilla Float", 50.33, vanillaFloat_Ingredients());

    private String name;
    private double price;
    private Map<Ingredient, Double> ingredients;

    MealsExamples(String name, double price, Map<Ingredient, Double> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;

    }

    private static Map<Ingredient, Double> friedChicken_ingredients() {
        Ingredient chickenPiece = new Ingredient(IngredientList.CHICKEN_PIECE.getName(), IngredientList.CHICKEN_PIECE.getStock());
        Ingredient breadCrumbsKG = new Ingredient(IngredientList.BREAD_CRUMBS_KG.getName(), IngredientList.BREAD_CRUMBS_KG.getStock());
        Ingredient egg = new Ingredient(IngredientList.EGG.getName(), IngredientList.EGG.getStock());
        Ingredient oilLTR = new Ingredient(IngredientList.OIL_LTR.getName(), IngredientList.OIL_LTR.getStock());
        Ingredient chickenSeasoningKG = new Ingredient(IngredientList.CHICKEN_SEASONING_KG.getName(), IngredientList.CHICKEN_SEASONING_KG.getStock());

        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(chickenPiece, 3.0);
        ingredients.put(breadCrumbsKG, 0.25);
        ingredients.put(egg, 2.0);
        ingredients.put(oilLTR, 0.5);
        ingredients.put(chickenSeasoningKG, 0.250);

        return ingredients;
    }

    private static Map<Ingredient, Double> cheeseBurger_Ingredients() {
        Ingredient burgerBuns = new Ingredient(IngredientList.BURGER_BUNS.getName(), IngredientList.BURGER_BUNS.getStock());
        Ingredient groundedMeatKG = new Ingredient(IngredientList.GROUNDED_MEAT_KG.getName(), IngredientList.GROUNDED_MEAT_KG.getStock());
        Ingredient saltKG = new Ingredient(IngredientList.SALT_KG.getName(), IngredientList.SALT_KG.getStock());
        Ingredient meatSeasoningKG = new Ingredient(IngredientList.MEAT_SEASONING_KG.getName(), IngredientList.MEAT_SEASONING_KG.getStock());
        Ingredient cheeseSlice = new Ingredient(IngredientList.CHEESE_SLICE.getName(), IngredientList.CHEESE_SLICE.getStock());
        Ingredient secretDressingLTR = new Ingredient(IngredientList.SECRET_DRESSING_LTR.getName(), IngredientList.SECRET_DRESSING_LTR.getStock());

        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(burgerBuns, 2.0);
        ingredients.put(groundedMeatKG, 0.3);
        ingredients.put(saltKG, 0.005);
        ingredients.put(meatSeasoningKG, 0.05);
        ingredients.put(cheeseSlice, 2.0);
        ingredients.put(secretDressingLTR, 0.125);

        return ingredients;
    }

    private static Map<Ingredient, Double> babyRibs_Ingredients() {
        Ingredient babyBackRibs = new Ingredient(IngredientList.BABY_BACK_RIBS_RACK.getName(), IngredientList.BABY_BACK_RIBS_RACK.getStock());
        Ingredient bbqSauceLTR = new Ingredient(IngredientList.BBQ_SAUCE_LTR.getName(), IngredientList.BBQ_SAUCE_LTR.getStock());

        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(babyBackRibs, 1.0);
        ingredients.put(bbqSauceLTR, 0.25);

        return ingredients;
    }

    private static Map<Ingredient, Double> frenchFries_Ingredients() {
        Ingredient potatoesKG = new Ingredient(IngredientList.POTATOES_KG.getName(), IngredientList.POTATOES_KG.getStock());
        Ingredient saltKG = new Ingredient(IngredientList.SALT_KG.getName(), IngredientList.SALT_KG.getStock());
        Ingredient specialSeasoningKG = new Ingredient(IngredientList.SPECIAL_SEASONING_KG.getName(), IngredientList.SPECIAL_SEASONING_KG.getStock());

        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(potatoesKG, 0.3);
        ingredients.put(saltKG, 0.03);
        ingredients.put(specialSeasoningKG, 0.1);

        return ingredients;
    }

    private static Map<Ingredient, Double> milkshake_Ingredients() {
        Ingredient milkLTR = new Ingredient(IngredientList.MILK_LTR.getName(), IngredientList.MILK_LTR.getStock());
        Ingredient vanillaIceCreamLTR = new Ingredient(IngredientList.VANILLA_ICECREAM_LTR.getName(), IngredientList.VANILLA_ICECREAM_LTR.getStock());
        Ingredient whippedCreamLTR = new Ingredient(IngredientList.WHIPPED_CREAM_LTR.getName(), IngredientList.WHIPPED_CREAM_LTR.getStock());

        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(milkLTR, 0.4);
        ingredients.put(vanillaIceCreamLTR, 0.2);
        ingredients.put(whippedCreamLTR, 0.125);

        return ingredients;
    }

    private static Map<Ingredient, Double> vanillaFloat_Ingredients() {
        Ingredient rootBeerLTR = new Ingredient(IngredientList.ROOT_BEER_LTR.getName(), IngredientList.ROOT_BEER_LTR.getStock());
        Ingredient vanillaIceCreamLTR = new Ingredient(IngredientList.VANILLA_ICECREAM_LTR.getName(), IngredientList.VANILLA_ICECREAM_LTR.getStock());

        Map<Ingredient, Double> ingredients = new HashMap<>();

        ingredients.put(rootBeerLTR, 0.4);
        ingredients.put(vanillaIceCreamLTR, 0.2);

        return ingredients;
    }
}
