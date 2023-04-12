import model.Customer;
import model.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Customer customer = greeting();

        Menu menu = new Menu();
        menu.showMenu();
//        customer.makeOrder(menu);

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

}


