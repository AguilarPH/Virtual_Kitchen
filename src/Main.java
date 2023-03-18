import model.Client;
import model.Menu;
import model.MenuItems;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client = greeting();
        showMenu();

//        System.out.println(takingOrder(client));
        System.out.printf("Your order will be delivered to %s", client.getAddress());

    }

    private static Client greeting(){
        Scanner sc = new Scanner(System.in);
        Client client = new Client();
        StringBuilder addressRequest = new StringBuilder("Hello ");

        System.out.println("Welcome to my Kitchen");
        System.out.println("Please type your name: ");
        client.setName(sc.nextLine());
        addressRequest.append(client.getName())
                .append(", please provide us your address:")
                .append("\n");
        System.out.print(addressRequest);
        client.setAddress(sc.nextLine());

        return client;
    }

    private static void showMenu(){
        StringBuilder menu = new StringBuilder();
        List<Menu> carte = new ArrayList<>();
        int maxItemLength = 0;

        carte.add(new Menu(MenuItems.FRIED_CHICKEN, Menu.MAIN_DISH));
        carte.add(new Menu(MenuItems.BABY_RIBS, Menu.MAIN_DISH));
        carte.add(new Menu(MenuItems.FRENCH_FRIES, Menu.SIDE_DISH));
        carte.add(new Menu(MenuItems.FRENCH_FRIES, Menu.SIDE_DISH));
        carte.add(new Menu(MenuItems.MILKSHAKE, Menu.SOFT_DRINK));

//        get the length of longest item
        for (int i = 0; i < carte.size() - 2; i++) {
            if (carte.get(i).toString().length() > maxItemLength) {
                maxItemLength = carte.get(i).toString().length();
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
        for (Menu item : carte) {
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

    private static void takingOrder(Client client) { //Next thing to fix
        Order order = new Order();
//        order.showMenu(carte);

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

    }

}


