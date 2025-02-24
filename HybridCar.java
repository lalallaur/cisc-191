package edu.sdccd.cisc191;

public class HybridCar extends Car implements Combustible, Chargeable {
    private int fuelLevel;
    private int batteryCharge;

    public HybridCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
        this.fuelLevel = 0;
        this.batteryCharge = 0;
    }

    @Override
    public void tankUp() {
        fuelLevel = 100;
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void chargeUp() {
        batteryCharge = 100;
    }

    @Override
    public int getBatteryCharge() {
        return batteryCharge;
    }
}
