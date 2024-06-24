package parking;

import java.util.concurrent.TimeUnit;

public class MinuteCost implements CostStrategy {
    @Override
    public long costEstimation(Ticket ticket) {
        long minutesParked = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - ticket.entryTime);
        return minutesParked * ticket.parkingSpot.price;
    }
}
