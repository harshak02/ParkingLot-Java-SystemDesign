package parking;

public class ParkingSpotFactory {
    public ParkingSpot createParkingSpot(int id, int price, VehicleType type) {
        if (type == VehicleType.TwoWheeler) {
            return new TwoWheelerSpot(id, price);
        } else if (type == VehicleType.FourWheeler) {
            return new FourWheelerSpot(id, price);
        } else {
            return null;
        }
    }
}
