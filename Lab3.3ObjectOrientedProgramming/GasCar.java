package edu.sdccd.cisc191;

public class GasCar extends Car implements Combustible {
    private int fuelLevel;

    public GasCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
        this.fuelLevel = 0;
    }

    @Override
    public void tankUp() {
        fuelLevel = 100;
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
}
