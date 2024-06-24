package parking;

public class EntranceGate {
    TwoWheelerManager twoWheelerManager;
    FourWheelerManager fourWheelerManager;

    public EntranceGate(TwoWheelerManager twoWheelerManager, FourWheelerManager fourWheelerManager) {
        this.twoWheelerManager = twoWheelerManager;
        this.fourWheelerManager = fourWheelerManager;
    }

    public ParkingSpot findParkingSpace(Vehicle vehicle) {
        if (vehicle.vehicleType == VehicleType.TwoWheeler) {
            return twoWheelerManager.findParkingSpace(vehicle.strategy);
        } else if (vehicle.vehicleType == VehicleType.FourWheeler) {
            return fourWheelerManager.findParkingSpace(vehicle.strategy);
        }
        return null;
    }

    public void parkVehicle(Vehicle v, ParkingSpot spot) {
        spot.parkVehicle(v);
    }

    public Ticket generateTicket(Vehicle v, ParkingSpot spot) {
        return new Ticket(spot, v);
    }
}
