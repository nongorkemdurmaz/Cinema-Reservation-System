package edu.estu.reservation;

import edu.estu.Main;
import edu.estu.model.Movie;
import edu.estu.model.Scene;
import edu.estu.reservation.payment.Refund;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Reservation {

    public void make(int ID) {
        if (ID < 5) {
            System.out.println("1- Make a reservation");
            System.out.println("\n" + getMovie(ID) + "\n" + getScene(ID) + "\n");
        }
        else {
            Main.logoutException();
        }
    }
    public void cancel(int ID) {
        Refund refund = new Refund();
        if (ID < 5) {
            System.out.println("3- Cancel the reservation");
            System.out.println("The reservation of the movie you selected will be cancelled.");
            System.out.println("\n" + getMovie(ID) + "\n" + getScene(ID) + "\n");
            refund.information();
        }
        else {
            Main.logoutException();
        }
    }
    public void list() {
        System.out.println("2- To list reservations");
        System.out.println("Here's your reservation:" + "\n");
        Movie movie1 = getMovie(0);
        Scene scene1 = getScene(0);
        System.out.println(movie1.toString() + "\n" + scene1.toString() + "\n");

        Movie movie2 = getMovie(1);
        Scene scene2 = getScene(1);
        System.out.println(movie2.toString() + "\n" + scene2.toString() + "\n");

        Movie movie3 = getMovie(2);
        Scene scene3 = getScene(2);
        System.out.println(movie3.toString() + "\n" + scene3.toString() + "\n");

        Movie movie4 = getMovie(3);
        Scene scene4 = getScene(3);
        System.out.println(movie4.toString() + "\n" + scene4.toString() + "\n");

        Movie movie5 = getMovie(4);
        Scene scene5 = getScene(4);
        System.out.println(movie5.toString() + "\n" + scene5.toString() + "\n");

    }


    public Movie getMovie(int ID){
        List<Movie> array = new ArrayList<>();
        Movie movie1 = new Movie("Spider-Man: Far from Home");
        Movie movie2 = new Movie("The Lord of the Rings: The Return of the King");
        Movie movie3 = new Movie("Inception");
        Movie movie4 = new Movie("Interstellar");
        Movie movie5 = new Movie("Matrix Resurrections");

        array.add(movie1);
        array.add(movie2);
        array.add(movie3);
        array.add(movie4);
        array.add(movie5);
        return array.get(ID);
    }

    public  Scene getScene(int ID){
        List<Scene> array = new ArrayList<>();

        LocalDateTime time1 = LocalDateTime.of(2022, Month.JANUARY, 17, 14, 0);
        Scene scene1 = new Scene("Scene : 1", time1, "Seat : 1");

        LocalDateTime time2 = LocalDateTime.of(2022, Month.JANUARY, 6, 11, 45);
        Scene scene2 = new Scene("Scene : 2", time2, "Seat : 10");

        LocalDateTime time3 = LocalDateTime.of(2022, Month.JANUARY, 15, 14, 15);
        Scene scene3 = new Scene("Scene : 3", time3, "Seat : 5");

        LocalDateTime time4 = LocalDateTime.of(2022, Month.JANUARY, 31, 9, 30);
        Scene scene4 = new Scene("Scene : 4", time4, "Seat : 7");

        LocalDateTime time5 = LocalDateTime.of(2022, Month.JANUARY, 19, 12, 0);
        Scene scene5 = new Scene("Scene : 5", time5, "Seat : 3");

        array.add(scene1);
        array.add(scene2);
        array.add(scene3);
        array.add(scene4);
        array.add(scene5);
        return array.get(ID);
    }
}