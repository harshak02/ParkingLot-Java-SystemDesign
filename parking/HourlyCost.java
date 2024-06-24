package parking;

import java.util.concurrent.TimeUnit;

public class HourlyCost implements CostStrategy {
    @Override
    public long costEstimation(Ticket ticket) {
        long hoursParked = TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - ticket.entryTime);
        return hoursParked * ticket.parkingSpot.price;
    }
}
