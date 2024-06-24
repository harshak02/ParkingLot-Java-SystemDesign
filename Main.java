import parking.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create parking spots
        List<ParkingSpot> twoWheelerSpots = new ArrayList<>();
        List<ParkingSpot> fourWheelerSpots = new ArrayList<>();

        ParkingSpotFactory spotFactory = new ParkingSpotFactory();

        // Creating some two-wheeler and four-wheeler parking spots
        for (int i = 1; i <= 5; i++) {
            twoWheelerSpots.add(spotFactory.createParkingSpot(i, 10, VehicleType.TwoWheeler));
            fourWheelerSpots.add(spotFactory.createParkingSpot(i, 20, VehicleType.FourWheeler));
        }

        // Create parking managers
        TwoWheelerManager twoWheelerManager = new TwoWheelerManager(twoWheelerSpots);
        FourWheelerManager fourWheelerManager = new FourWheelerManager(fourWheelerSpots);

        // Create entrance gate
        EntranceGate entranceGate = new EntranceGate(twoWheelerManager, fourWheelerManager);

        // Create a two-wheeler vehicle
        Vehicle twoWheeler = new Vehicle(101, VehicleType.TwoWheeler, "NearestToEntrance");

        // Find a parking spot for the two-wheeler vehicle
        ParkingSpot spot = entranceGate.findParkingSpace(twoWheeler);

        // Park the vehicle
        if (spot != null) {
            entranceGate.parkVehicle(twoWheeler, spot);

            // Generate a ticket
            Ticket ticket = entranceGate.generateTicket(twoWheeler, spot);
            ticket.ticketDisplay();

            // Simulate some time passing (e.g., 61 seconds)
            try {
                Thread.sleep(61000); // Sleep for 61 seconds to simulate time passage
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Exit process
            ExitGate exitGate = new ExitGate();
            long cost = exitGate.costEstimation(ticket, "Minute");
            System.out.println("Parking cost: " + cost);
            Boolean paymentSuccess = exitGate.payment(ticket, "Card");
            exitGate.exitVehicle(ticket, paymentSuccess);

        } else {
            System.out.println("No parking spot available for the vehicle.");
        }
    }
}
