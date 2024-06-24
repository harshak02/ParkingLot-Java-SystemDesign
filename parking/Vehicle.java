package parking;

public class Vehicle {
    int vehicleNumber;
    VehicleType vehicleType;
    String strategy;

    public Vehicle(int vehicleNumber, VehicleType vehicleType, String strategy) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.strategy = strategy;
    }
}
