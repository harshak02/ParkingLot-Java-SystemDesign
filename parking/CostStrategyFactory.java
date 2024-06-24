package parking;

public class CostStrategyFactory {
    public CostStrategy createCostStrategy(String strategy) {
        switch (strategy) {
            case "Hourly":
                return new HourlyCost();
            case "Minute":
                return new MinuteCost();
            case "Default":
                return new DefaultCost();
            default:
                return null;
        }
    }
}
