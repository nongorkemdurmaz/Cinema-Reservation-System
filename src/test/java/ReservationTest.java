import edu.estu.Main;
import edu.estu.customer.Customer;
import edu.estu.model.Movie;
import edu.estu.reservation.Reservation;
import edu.estu.reservation.payment.Payment;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReservationTest {

    @Test
    public void Test1() {
        Reservation reservation = new Reservation();
        Movie movie = new Movie("Spider-Man: Far from Home");
        reservation.make(0);
        assertEquals("******* Spider-Man: Far from Home *******", movie.toString());
        reservation.list();
        assertTrue(reservation.toString(), true);
        reservation.cancel(0);
        assertEquals("******* Spider-Man: Far from Home *******", movie.toString());
    }

    @Test
    public void Test2() {
        Payment payment = new Payment();
        payment.information(1);
        assertTrue(payment.toString(), true);
    }

    @Test
    public void Test3() {
        Customer customer = new Customer();
        customer.login(0);
        assertTrue(customer.login(0), true);
    }

    @Test
    public void Test4() {
        Main main = new Main();
        assertEquals("""
                
                Menu
                1- Make a reservation
                2- To list reservations
                3- Cancel the reservation
                4- To see the menu
                5- Quit
                """,main.toString());
    }
}
