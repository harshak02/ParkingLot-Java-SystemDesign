package parking;

public class DefaultCost implements CostStrategy {
    @Override
    public long costEstimation(Ticket ticket) {
        return ticket.parkingSpot.price;
    }
}
