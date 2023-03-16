import model.Menu;
import model.MenuItems;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clientName, clientAddress;

        StringBuilder addressRequest = new StringBuilder("Hello ");

        clientName = sc.nextLine();
        addressRequest.append(clientName)
            .append(", Please provide your delivery address")
                .append("\n");
        System.out.print(addressRequest);
        clientAddress = sc.nextLine();

        System.out.println(takingOrder(clientName, clientAddress));
        System.out.printf("Your order will be delivered to %s", clientAddress);

    }

    private static void greeting(){
        Scanner sc = new Scanner(System.in);
        String clientName;

        System.out.println("Welcome to my Kitchen");
        System.out.println("Please type your name: ");
        clientName = sc.nextLine(); //pending to create a Client model

    }

    private static StringBuilder takingOrder(String clientName, String clientAddress) {
        List<Menu> carte = new ArrayList<>();
        carte.add(new Menu(MenuItems.FRIED_CHICKEN, Menu.MAIN_DISH));
        carte.add(new Menu(MenuItems.BABY_RIBS, Menu.MAIN_DISH));
        carte.add(new Menu(MenuItems.FRENCH_FRIES, Menu.SIDE_DISH));
        carte.add(new Menu(MenuItems.FRENCH_FRIES, Menu.SIDE_DISH));
        carte.add(new Menu(MenuItems.MILKSHAKE, Menu.SOFT_DRINK));

        Order order = new Order();
        order.showMenu(carte);

        Scanner sc = new Scanner(System.in);
        NumberFormat curF = NumberFormat.getCurrencyInstance();
        String mealRequest;
        StringBuilder output = new StringBuilder("We are preparing your ");

        System.out.printf("What meal would you like to have?: %n");
        mealRequest = sc.nextLine();

        if (mealRequest != "") {
            output.append(mealRequest)
                    .append(", your total will be ")
                    .append(curF.format(Order.check(mealRequest)));
        }

        return output;
    }

}

