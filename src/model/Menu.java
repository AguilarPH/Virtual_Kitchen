package model;

import java.util.*;

public class Menu {

    private static final List<Meal> meals = new ArrayList<>();

    public static List<Meal> getMeals() {
        return meals;
    }


    public static void showMenu(){
        for (Meal meal : Meal.values()) {
            if (meal.isAvailable()) {
                meals.add(meal);
            }
        }

        StringBuilder menu = new StringBuilder();
        int maxItemLength = 0;


//        get the length of longest item
        for (int i = 0; i < meals.size() - 2; i++) {
            if (meals.get(i).getName().length() > maxItemLength) {
                maxItemLength = meals.get(i).getName().length();
            }
        }

//        Print menu header
        for (int i = 0; i <= (maxItemLength - 2); i++) {
            menu.append("*");
        }

        menu.append(" Menu ");

        for (int i = 0; i <= (maxItemLength - 2); i++) {
            menu.append("*");
        }

        menu.append("\n")
                .append("\n");

//        Print menu items and prices
        for (Meal item : meals) {
            int blankSpace = 7 + maxItemLength - item.getName().length();
            menu.append(item.getName());

            for (int i = 0; i <= blankSpace; i++) {
                menu.append(" ");
            }

            menu.append(item.getPrice())
                    .append("\n")
                    .append("\n");
        }
        System.out.println(menu);

    }

    public static void updateMenu() {
        meals.get(0).isAvailable();
    }

}
