import model.Customer;
import model.Menu;
import model.Cart;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu.showMenu();

//        System.out.println(takingOrder(client));
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

        return client;
    }

    private static void takingOrder(Customer client) { //Next thing to fix
        Cart order = new Cart();
//        order.showMenu(carte);

        Scanner sc = new Scanner(System.in);
        NumberFormat curF = NumberFormat.getCurrencyInstance();
        String mealRequest;
        StringBuilder output = new StringBuilder("We are preparing your ");

        System.out.printf("What meal would you like to have?: %n");
        mealRequest = sc.nextLine();

        if (!mealRequest.equals("")) {
            output.append(mealRequest)
                    .append(", your total will be ")
                    .append(curF.format(Cart.check(mealRequest)));
        }

    }

}


