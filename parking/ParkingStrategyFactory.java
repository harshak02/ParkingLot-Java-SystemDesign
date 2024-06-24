package parking;

public class ParkingStrategyFactory {
    public ParkingStrategy createParkingStrategy(String strategy) {
        switch (strategy) {
            case "NearestToEntrance":
                return new NearestToEntrance();
            case "NearestToExit":
                return new NearestToExit();
            case "NearestToElevator":
                return new NearestToElevator();
            default:
                return null;
        }
    }
}
