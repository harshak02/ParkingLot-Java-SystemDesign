package parking;

public class CashPayment implements Payment {
    @Override
    public Boolean payment(Ticket ticket) {
        System.out.println("Payment done using cash for parking spot ID: " + ticket.parkingSpot.id);
        return true;
    }
}
