import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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

        System.out.println(takingOrder(clientName, clientAddress));
        System.out.printf("Your order will be delivered to %s", clientAddress);

    }

    public static StringBuilder takingOrder(String clientName, String clientAddress) {

        Scanner sc = new Scanner(System.in);
        NumberFormat curF = NumberFormat.getCurrencyInstance();
        String mealRequest;
        StringBuilder output = new StringBuilder("We are preparing your ");

        System.out.printf("What meal would you like to have?: %n");
        mealRequest = sc.nextLine();

        if (mealRequest != "") {
            output.append(mealRequest)
                    .append(", your total will be ")
                    .append(curF.format(menuCheck(mealRequest)));
        }

        return output;
    }

    public static double menuCheck(String ... items) {
        double orderSum = 0;

        for (String item : items) {
            switch (item.toLowerCase()) {
                case "fried chicken":
                    System.out.printf("%s added to the order\n", item);
                    orderSum += 92.3;
                    break;

                case "french fries":
                    orderSum += 26.0;
                    System.out.printf("%s added to the order\n", item);
                    break;

                case "milkshake":
                    orderSum += 40.0;
                    System.out.printf("%s added to the order\n", item);
                    break;

                default:
                    System.out.printf("%s is not in the menu \n", item);

            }
        }
        return orderSum;

    }

}

