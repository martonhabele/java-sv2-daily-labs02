package day04;

public class Car {
    private double filledFuel;
    private double fuelledRange;

    public Car(double filledFuel, double fuelledRange) {
        this.filledFuel = filledFuel;
        this.fuelledRange = fuelledRange;
    }

    public double avgConsumption(double filledFuel, double fuelledRange) {
        return (filledFuel / fuelledRange) * 100d;
    }

    public void setFilledFuel(double filledFuel) {
        this.filledFuel = filledFuel;
    }

    public void setFuelledRange(double fuelledRange) {
        this.fuelledRange = fuelledRange;
    }
}