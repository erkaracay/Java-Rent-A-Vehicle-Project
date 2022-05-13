package Vehicles;

import Interface.DrivingManual;
import Vehicle.Vehicle;

public class Motorcycle extends Vehicle implements DrivingManual{
    
    private String type;
    private int numOfWheels;
    private boolean trunk;
    
    public Motorcycle(double milage, int capacity, int modelYear, String brand, String model, int horsePower, String color, int dailyPrice,
            String plateNo, double engineCapacity, String type, int numOfWheels, boolean trunk) {
        super(milage, capacity, modelYear, brand, model, horsePower, color, dailyPrice, plateNo, engineCapacity);
        this.type = type;
        this.numOfWheels = numOfWheels;
        this.trunk = trunk;
    }

    public String getType() {
        return type;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public boolean getTrunk() {
        return trunk;
    }
    
    @Override
    public void calcRequiredLicense() {
        if (engineCapacity < 125)
            requiredLicense = "A1";
        else if (engineCapacity < 600)
            requiredLicense = "A2";
        else
            requiredLicense = "A";
    }

    @Override
    public String howtoDrive() {
        return "\nHow to drive a motorcycle:\n" +
               "1.Check tire pressures.\n" +
               "2.Put on motorcycle gear.\n" +
               "3.Get on the bike.\n" +
               "4.Start the engine.\n" +
               "5.Find the brakes and throttle.\n" +
               "6.Use the clutch and switch gears.\n" +
               "7.Do not forget to use blinkers.\n";
    }
    
    @Override
    public String toString() {
        return  "Motorcycle" +
                super.toString() + 
                "\nType: " + type +
                "\nNumber of Wheels: " + numOfWheels + 
                "\nHas Trunk: " + trunk + '\n';
    }

}