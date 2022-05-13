package Vehicles;

import Vehicle.Vehicle;

public class EScooter extends Vehicle{
    
    private double range;
    private int topSpeed;
    private double weightLimit;
    
    public EScooter(double milage, int capacity, int modelYear, String brand, String model, int horsePower, String color, int dailyPrice,
            String plateNo, double engineCapacity, double range, int topSpeed, double weightLimit) {
        super(milage, capacity, modelYear, brand, model, horsePower, color, dailyPrice, null, 0);
        this.range = range;
        this.topSpeed = topSpeed;
        this.weightLimit = weightLimit;
    }

    public double getRange() {
        return range;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public double getWeightLimit() {
        return weightLimit;
    }
    
    @Override
    public void calcRequiredLicense() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return  "EScooter" +
                super.toString() + 
                "\nRange: " + range + 
                "\nTop Speed: " + topSpeed + "km/h" +
                "\nWeight Limit: " + weightLimit + '\n';
    }    
}