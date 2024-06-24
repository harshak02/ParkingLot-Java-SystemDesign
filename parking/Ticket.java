package parking;

public class Ticket {
    long entryTime;
    ParkingSpot parkingSpot;
    Vehicle vehicle;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle) {
        this.entryTime = System.currentTimeMillis();
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    public void ticketDisplay() {
        System.out.println("Ticket for vehicle with id " + vehicle.vehicleNumber + " has been generated");
    }
}
