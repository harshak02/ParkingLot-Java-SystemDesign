package parking;

import java.util.List;

public class NearestToExit implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpace(List<ParkingSpot> spots) {
        for (int i = spots.size() - 1; i >= 0; i--) {
            if (spots.get(i).isEmpty) {
                return spots.get(i);
            }
        }
        return null;
    }
}
