package edu.sdccd.cisc191;

public class SportsUtilityVehicle extends Vehicle {
    private int maxTowingWeight;

    public SportsUtilityVehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int maxTowingWeight) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options);
        this.maxTowingWeight = maxTowingWeight;
    }

    public int getMaxTowingWeight() {
        return maxTowingWeight;
    }
}
