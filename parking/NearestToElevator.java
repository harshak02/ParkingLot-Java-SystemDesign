package parking;

import java.util.List;

public class NearestToElevator implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpace(List<ParkingSpot> spots) {
        int mid = spots.size() / 2;
        for (int i = 0; i < spots.size(); i++) {
            if (spots.get((mid + i) % spots.size()).isEmpty) {
                return spots.get((mid + i) % spots.size());
            }
        }
        return null;
    }
}
