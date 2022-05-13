package Vehicles;

import Interface.DrivingManual;
import Vehicle.Vehicle;

public class Car extends Vehicle implements DrivingManual {
    private String transmissionType, tractionType, bodyStyle;

    public Car(double milage, int capacity, int modelYear, String brand, String model, int horsePower, String color, int dailyPrice, 
            String plateNo, double engineCapacity, String transmissionType, String tractionType, String bodyStyle) {
        super(milage, capacity, modelYear, brand, model, horsePower, color, dailyPrice, plateNo, engineCapacity);
        this.transmissionType = transmissionType;
        this.tractionType = tractionType;
        this.bodyStyle = bodyStyle;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getTractionType() {
        return tractionType;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }
    
    @Override
    public void calcRequiredLicense() {
        requiredLicense = "B";
    }
    
    @Override
    public String howtoDrive() {
        return "\nHow to drive a car:\n" +
               "1.Check tire pressures.\n" +
               "2.Adjust the seat so that your feet comfortably reach both pedals.\n" +
               "3.Adjust the mirrors.\n" +
               "4.Put on your seatbelt.\n" +
               "5.Always start your car with your foot on the brake.\n" +
               "6.Turn on the engine and release the parking brake.\n" +
               "7.Do not forget to use blinkers.\n";
    }

    @Override
    public String toString() {
        return  "Car" +
                super.toString() +
                "\nTransmission Type: " + transmissionType +
                "\nTraction Type: " + tractionType + 
                "\nBody Style: " + bodyStyle + '\n';
    }

}