package model;

import java.util.*;

public class Cart {

    private List<CartItem> order = new ArrayList<>();

    public void addMeal(int quantity, int meal) {
        CartItem cartItem = new CartItem(quantity, meal)
        order.put(meal, quantity);
    }

    public void removeMeal(Meal meal) {
        if (order.size() == 0) {
            System.out.println("no items has been added to the order");
        } else {

            Set<Integer> mealSet = order.keySet();
            int toRemove = 0;

            if (order.get(meal) > 1) {
                Scanner sc = new Scanner(System.in);
                System.out.println("How many of theses meals do you want to remove?");
                toRemove = Integer.parseInt(sc.nextLine());
            }
            if ((order.get(meal) - toRemove) > 1) {
                order.replace(meal, (order.get(meal) - toRemove));
            } else {
                order.remove(meal);
            }

            System.out.println("item removed from order");

        }

    }

    public void cancelOrder() {
        order.clear();
         System.out.println("Order has been cancelled, all items were removed");
    }

    public void viewOrder() {
        StringBuilder recipe = new StringBuilder();
        int maxItemLength = 0;

        Set<Meal> mealSet = order.keySet();


//        get the length of longest item
        for (Meal meal : mealSet) {
            if (meal.getName().length() > maxItemLength) {
                maxItemLength = meal.getName().length();
            }
        }

//        Print recipe header
        for (int i = 0; i <= (maxItemLength - 2); i++) {
            recipe.append("*");
        }

        recipe.append(" Order ");

        for (int i = 0; i <= (maxItemLength - 2); i++) {
            recipe.append("*");
        }

        recipe.append("\n")
                .append("\n");

//        Print order items and prices
        for (Meal item : mealSet) {
            int blankSpace = 7 + maxItemLength - item.getName().length();
            recipe.append(item.getName());

            for (int i = 0; i <= blankSpace; i++) {
                recipe.append(" ");
            }

            recipe.append(item.getPrice() * order.get(item))
                    .append("\n")
                    .append("\n");
        }

        System.out.println(recipe);

    }
//    public double check(String ... items) {
//        double orderSum = 0;
//
//        for (String item : items) {
//
//
//            switch (item.toLowerCase()) {
//                case "fried chicken":
//                    System.out.printf("%s added to the order\n", item);
//                    orderSum += 92.3;
//                    break;
//
//                case "french fries":
//                    orderSum += 26.0;
//                    System.out.printf("%s added to the order\n", item);
//                    break;
//
//                case "milkshake":
//                    orderSum += 40.0;
//                    System.out.printf("%s added to the order\n", item);
//                    break;
//
//                default:
//                    System.out.printf("%s is not in the menu \n", item);
//
//            }
//        }
//        return orderSum;
//
//    }
}
