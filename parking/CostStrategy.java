package parking;

public interface CostStrategy {
    long costEstimation(Ticket ticket);
}
