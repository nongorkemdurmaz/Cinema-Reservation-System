package edu.estu;

import edu.estu.customer.Customer;
import edu.estu.reservation.Reservation;
import edu.estu.reservation.payment.Payment;

public class Main {

    static String mainMenu = """
                        
            *******************************************************************************
            Welcome to Reservation System
            If you have account you can login or you can create a new account
            """;
    static String closingPart = """
                        
            Thank you for using our cinema reservation system
            If your reservation is forgotten, it will be forwarded as an e-mail.
            *******************************************************************************
             """;
    static String menu = """
                            
            Menu
            1- Make a reservation
            2- To list reservations
            3- Cancel the reservation
            4- To see the menu
            5- Quit
            """;

    public static void open() {
        System.out.println(mainMenu);
    }

    public static void menu() {
        System.out.println(menu);
    }

    public static void close() {
        System.out.println(closingPart);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Reservation reservation = new Reservation();
        Payment payment = new Payment();
        open();
        customer.login(1);//You can change customer ID from 0 to 3 or If you want to register, you can write 4 instead of ID.
        menu();
        reservation.make(3);//You can also specify the movie ID from 0 to 4 whose reservation you want to make
        payment.information(2);/*
        If you make the payment part 1, you can pay with cash.
        If you make the payment part 2, you can pay with a coupon.
        If you enter other values, you will get an error.
         */
        reservation.list();
        reservation.cancel(3);//You can also specify the movie ID from 0 to 4 whose reservation you want to cancel

        close();
    }

    public static void logoutException() {
        System.out.println("""
                You entered the wrong entry, You are being redirected to the menu.
                """);
    }

    @Override
    public String toString() {
        return menu;
    }
}