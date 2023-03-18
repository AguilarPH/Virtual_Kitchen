import model.Menu;

import java.util.List;

public class Order {

    public double showMenuCheck(List<Menu> menu) {
        double totalPrice = 0;
        for (Menu i : menu){
            System.out.println(i.getName());
            totalPrice += i.getPrice();
        }

        return totalPrice;
    }
    public static double check(String ... items) {
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
