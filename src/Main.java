import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clientName, clientAddress;


        StringBuilder addressRequest = new StringBuilder("Hello ");

        System.out.println("Welcome to my Kitchen");
        System.out.println("Please type your name: ");
        clientName = sc.nextLine();
        addressRequest.append(clientName)
            .append(", Please provide your delivery address")
                .append("\n");
        System.out.print(addressRequest);
        clientAddress = sc.nextLine();

        takingOrder(clientName, clientAddress);


    }
    public static void takingOrder(String clientName, String clientAddress) {
        List<String> menu = new ArrayList<>();
        menu.add("Fried chicken");
        menu.add("French Fries");

        List<Double> menuPrices = new ArrayList<>();
        menuPrices.add(92.3);
        menuPrices.add(26.0);

        Scanner sc = new Scanner(System.in);
        String mealRequest;

        System.out.printf("What meal would you like to have?: %n");
        mealRequest = sc.nextLine();

        for (int i = 0 ; i < menu.size(); i++) {
            if (mealRequest.equalsIgnoreCase(menu.get(i))) {
                System.out.println(order(menu.get(i), clientName, menuPrices.get(i)));
                System.out.printf("you will have it delivered at %s", clientAddress);
            }
        }
    }

    public static StringBuilder order(String meal, String clientName, double price) {
        NumberFormat curF = NumberFormat.getCurrencyInstance();
        StringBuilder output = new StringBuilder("We are preparing your ");
        String priceF = curF.format(price);
        output.append(meal)
                .append(" ")
                .append(clientName)
                .append(", your total will be ")
                .append(priceF);

        return output;
    }

}

