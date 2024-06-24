package parking;

public class ExitGate {
    public void removeVehicle(Ticket ticket) {
        ticket.parkingSpot.removeVehicle();
    }

    public long costEstimation(Ticket ticket, String costStrategy) {
        CostStrategyFactory factory = new CostStrategyFactory();
        CostStrategy cost = factory.createCostStrategy(costStrategy);
        return cost.costEstimation(ticket);
    }

    public Boolean payment(Ticket ticket, String paymentMethod) {
        PaymentFactory factory = new PaymentFactory();
        Payment pay = factory.createPayment(paymentMethod);
        return pay.payment(ticket);
    }

    public void exitVehicle(Ticket ticket, Boolean paymentSuccess) {
        if (paymentSuccess) {
            removeVehicle(ticket);
            System.out.println("Vehicle with ticket id " + ticket.entryTime + " has left");
        } else {
            System.out.println("Payment failed");
        }
    }
}
