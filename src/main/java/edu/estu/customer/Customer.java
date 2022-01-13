package edu.estu.customer;

import edu.estu.Main;

public class Customer {

    static String[] name;
    static String[] password;

    public String login(int ID) {

        if (ID < 4) {
            name = new String[]{"Görkem Durmaz", "İnanç Ok", "Zeynep Batmaz", "Gökhan Göksel"};
            password = new String[]{"****", "****", "*****", "*****"};
            System.out.println("Name = " + name[ID] + "\n" + "Password = " + password[ID]);
            System.out.println("\nYou are logged into the Cinema Reservation System. " + "Welcome, " + name[ID]);
        } else if(ID == 4) {
            register(0);
        }
        else {
            Main.logoutException();
        }
        return "";
    }


    public void register(int ID) {
        name = new String[]{"New Account"};
        password = new String[]{"******"};
        System.out.println("\nYour registration is complete.");
        System.out.println("\nUser = " + name[ID] + "\n" + "Password = " + password[ID]);
        System.out.println("You are logged into the Cinema Reservation System. " + "Welcome, " + name[ID]);
    }

}