package parking;

import java.util.List;

public class NearestToEntrance implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpace(List<ParkingSpot> spots) {
        for (ParkingSpot spot : spots) {
            if (spot.isEmpty) {
                return spot;
            }
        }
        return null;
    }
}
