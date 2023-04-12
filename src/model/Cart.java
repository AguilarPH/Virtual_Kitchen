package model;

import java.util.*;

public class Cart {

    private List<CartItem> order = new ArrayList<>();

    public void addMeal(int quantity, Meal meal) {
        CartItem cartItem = new CartItem(quantity, meal);
        order.add(cartItem);
    }

    public void removeMeal(Meal meal) {
        if (order.size() == 0) {
            System.out.println("no items has been added to the order");
        } else {
            int toRemove = 0;

            for (int i = 0; i < order.size(); i++) {
                if (order.get(i).getMeal() == meal) {
                    if (order.get(i).getQuantity() > 1) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("How many of theses meals do you want to remove?");
                        toRemove = Integer.parseInt(sc.nextLine());
                    }
                    order.get(i).setQuantity(order.get(i).getQuantity() - toRemove);
                    if (order.get(i).getQuantity() <=0) {
                        order.remove(i);
                    }
                }
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


//        get the length of longest item
        for (CartItem cartItem : order) {
            if (cartItem.getMeal().getName().length() > maxItemLength) {
                maxItemLength = cartItem.getMeal().getName().length();
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
        for (CartItem item : order) {
            int blankSpace = 7 + maxItemLength - item.getMeal().getName().length();
            recipe.append(item.getMeal().getName());

            for (int i = 0; i <= blankSpace; i++) {
                recipe.append(" ");
            }

            recipe.append(item.getMeal().getPrice() * item.getQuantity())
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
