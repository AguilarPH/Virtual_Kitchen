package model;

import java.util.*;

public class Menu {

    private List<Meal> meals = new ArrayList<>();

    public List<Meal> getMeals() {
        return meals;
    }

    public void showMenu(){
        for (Meal meal : meals) {
            if (meal.isAvailable()) {
                meals.add(meal);
            }
        }

        StringBuilder menuDisplay = new StringBuilder();
        int maxItemLength = 0;


//        get the length of longest item
        for (int i = 0; i < meals.size() - 1; i++) {
            if (meals.get(i).getName().length() > maxItemLength) {
                maxItemLength = meals.get(i).getName().length();
            }
        }

//        Print menu header
        for (int i = 0; i <= (maxItemLength - 2); i++) {
            menuDisplay.append("*");
        }

        menuDisplay.append(" Menu ");

        for (int i = 0; i <= (maxItemLength - 2); i++) {
            menuDisplay.append("*");
        }

        menuDisplay.append("\n")
                .append("\n");

//        Print menu items and prices
        for (Meal item : meals) {
            int blankSpace = 7 + maxItemLength - item.getName().length();
            menuDisplay.append(item.getName());

            for (int i = 0; i <= blankSpace; i++) {
                menuDisplay.append(" ");
            }

            menuDisplay.append(item.getPrice())
                    .append("\n")
                    .append("\n");
        }
        System.out.println(menuDisplay);

    }

}
