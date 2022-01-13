package edu.estu.reservation.payment;

import edu.estu.Main;
import edu.estu.reservation.Reservation;

public class Payment extends Reservation {

    String cash;
    String coupon;

    public void information(int pay) {

        if( pay == 1){
            cash = "30.0";
            System.out.println("Amount you have to pay.");
            System.out.println(cash + "$");
            confirm();
        } else if (pay == 2){
            coupon = "coupon";
            System.out.println("You used a " + coupon + ". "  + "You don't need to pay.");
            confirm();
        }else{
            Main.logoutException();
        }
    }

    public void confirm() {
            System.out.println("Your reservation is confirmed. Show your ticket at the entrance.\n");
    }

    @Override
    public String toString() {
        return cash + " ---- " +coupon;
    }
}