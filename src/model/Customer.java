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

    public static void getAdminOpts(String username) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Please insert password");
        String password = sc.nextLine();


    }

}
