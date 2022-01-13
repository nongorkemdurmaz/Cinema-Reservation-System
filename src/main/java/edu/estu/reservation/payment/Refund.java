package edu.estu.reservation.payment;

import edu.estu.reservation.Reservation;

public class Refund extends Reservation {

    public void information() {
            System.out.println("Your money has been refunded due to the cancellation of your reservation.");
            confirm();
    }

    public void confirm() {
            System.out.println("Your reservation has been canceled.");
    }
}