package parking;

import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> spots;
    ParkingStrategy strategy;

    public ParkingSpotManager(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public ParkingSpot findParkingSpace(String type) {
        ParkingStrategyFactory factory = new ParkingStrategyFactory();
        strategy = factory.createParkingStrategy(type);
        if (strategy != null) {
            return strategy.findParkingSpace(spots);
        }
        return null;
    }
}
