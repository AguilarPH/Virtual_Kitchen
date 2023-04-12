package model;

import java.util.Scanner;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setAddress(String address) {this.address = address;}

    public String getAddress() {return address;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public void getAdminOpts(String username) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert password");
        String password = sc.nextLine();
    }

    public void makeOrder(Menu menu) {
        Cart cart = new Cart();
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        System.out.println("What meal would you like to order?");
        String mealRequest = sc.nextLine();

        System.out.println("How many times do you wish to add this meal to your order?");
        int repeats = Integer.parseInt(sc.nextLine());

        for (Meal meal : menu.getMeals()) {
            if (meal.getName().equals(mealRequest)) {
                cart.addMeal(repeats, meal);
                output.append("Added ")
                        .append(repeats)
                        .append(" ")
                        .append(meal.getName())
                        .append(" to you order.");
            }
        }
    }



}
