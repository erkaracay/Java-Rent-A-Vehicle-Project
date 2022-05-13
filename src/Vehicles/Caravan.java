package Vehicles;

import Interface.DrivingManual;
import Vehicle.Vehicle;

public class Caravan extends Vehicle implements DrivingManual {
    private int bedCapacity;
    private double weight;
    private boolean kitchen;
    private boolean bathroom;
    private String transmissionType, tractionType;
    
    public Caravan(double milage, int capacity, int modelYear, String brand, String model, int horsePower, String color, int dailyPrice, 
            String plateNo, double engineCapacity, int bedCapacity, double weight , boolean kitchen, boolean bathroom, String transmissionType, String tractionType) {
        super(milage, capacity, modelYear, brand, model, horsePower, color, dailyPrice, plateNo, engineCapacity);
        this.bedCapacity = bedCapacity;
        this.weight = weight;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.transmissionType = transmissionType;
        this.tractionType = tractionType;
    }

    public int getBedCapacity() {
        return bedCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public boolean getKitchen() {
        return kitchen;
    }

    public boolean getBathroom() {
        return bathroom;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getTractionType() {
        return tractionType;
    }
    
    @Override
    public void calcRequiredLicense() {
        if (weight < 4000)
            requiredLicense = "B";
        else
            requiredLicense = "C";
    }

    @Override
    public String howtoDrive() {
        return "\nHow to drive a caravan:\n" +
               "1.Check tire pressures.\\n\n" +
               "2.make sure that all moving parts in the accommodation area are fixed.\n" +
               "3.Make sure passengers are fastened.\\n\n" +
               "4.Adjust the seat so that your feet comfortably reach both pedals.\n" +
               "5.Adjust the mirrors.\n" +
               "6.Put on your seatbelt.\n" +
               "5.Always start your car with your foot on the brake.\n" +
               "7.Turn on the engine and release the parking brake.\n" +
               "8.Do not forget to use blinkers.\n";
    }
    
    @Override
    public String toString() {
        return  "Caravan" +
                super.toString() + 
                "\nBedCapacity: " + bedCapacity + 
                "\nWeight: " + weight + 
                "\nHas Kitchen: " + kitchen +
                "\nHas Bathroom: " + bathroom +
                "\nTransmission Type: " + transmissionType +
                "\nTraction Type: " + tractionType + '\n';
    }
    
}