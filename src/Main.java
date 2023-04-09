import model.Customer;
import model.Meal;
import model.Menu;
import model.Cart;
import java.text.NumberFormat;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Customer customer = greeting();

        Menu.showMenu();

//        System.out.printf("Your order will be delivered to %s", client.getAddress());

    }

    private static Customer greeting(){
        Scanner sc = new Scanner(System.in);
        Customer client = new Customer();
        StringBuilder addressRequest = new StringBuilder("Hello ");

        System.out.println("Welcome to my Kitchen");
        System.out.println("Please type your name: ");
        client.setName(sc.nextLine());
        addressRequest.append(client.getName())
                .append(", please provide us your address:")
                .append("\n");
        System.out.print(addressRequest);
        client.setAddress(sc.nextLine());

        System.out.println("Finally, please provide a contact phone number: ");
        client.setPhoneNumber(sc.nextLine());
        System.out.print("\n");

        return client;
    }

    private static void takingOrder(Customer client) { // To Finish

        Scanner sc = new Scanner(System.in);
        NumberFormat curF = NumberFormat.getCurrencyInstance();
        StringBuilder output = new StringBuilder();

        System.out.println("What meal would you like to order?");
        String mealRequest = sc.nextLine();


        System.out.println("How many times do you wish to add this meal to your order?");
        int repeats = Integer.parseInt(sc.nextLine());

        for (Meal meal : Menu.getMeals()) {
            if (meal.getName().equals(mealRequest)) {
                Cart.addMeal(repeats, meal);

                output.append("Added ")
                        .append(repeats)
                        .append(" ")
                        .append(meal.getName())
                        .append(" to you order.");
            }
        }

    }

}


