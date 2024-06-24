package parking;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot findParkingSpace(List<ParkingSpot> spots);
}
