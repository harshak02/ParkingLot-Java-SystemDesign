package parking;

public class CardPayment implements Payment {
    @Override
    public Boolean payment(Ticket ticket) {
        System.out.println("Payment done using card for parking spot ID: " + ticket.parkingSpot.id);
        return true;
    }
}
