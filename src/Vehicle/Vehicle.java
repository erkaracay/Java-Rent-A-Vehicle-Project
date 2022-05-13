package Vehicle;

import java.util.Date;

public abstract class Vehicle {
    protected double milage;
    protected int capacity, modelYear;
    protected String brand, model;
    protected int horsePower;
    protected String color;
    protected int dailyPrice;
    protected String requiredLicense;
    protected String plateNo;
    protected Date startDate, endDate;
    protected double engineCapacity;
    protected static int numOfVehicles = 0;

    public Vehicle(double milage, int capacity, int modelYear, String brand, String model, 
            int horsePower, String color, int dailyPrice, String plateNo, Date startDate, Date endDate, double engineCapacity) {
        this.milage = milage;
        this.capacity = capacity;
        this.modelYear = modelYear;
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.color = color;
        this.dailyPrice = dailyPrice;
        this.plateNo = plateNo;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public Vehicle(double milage, int capacity, int modelYear, String brand, String model, 
            int horsePower, String color, int dailyPrice, String plateNo, double engineCapacity) {
        this.milage = milage;
        this.capacity = capacity;
        this.modelYear = modelYear;
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.color = color;
        this.dailyPrice = dailyPrice;
        this.plateNo = plateNo;
        this.engineCapacity = engineCapacity;
        numOfVehicles++;
    }
    
    public double getMilage() {
        return milage;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public int getModelYear() {
        return modelYear;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getHorsePower() {
        return horsePower;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getDailyPrice() {
        return dailyPrice;
    }
    
    public String getRequiredLicense() {
        return requiredLicense;
    }
    
    public String getPlateNo() {
        return plateNo;
    }
    
    public Date getStartDate() {
        return startDate;
    }
    
    public Date getEndDate() {
        return endDate;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public abstract void calcRequiredLicense();

    @Override
    public String toString() {
        return    "\nMilage: " + milage + "km"
                + "\nCapacity: " + capacity 
                + "\nModel Year: " + modelYear 
                + "\nBrand: " + brand 
                + "\nModel: " + model 
                + "\nHorsepower: " + horsePower 
                + "\nEngine Capacity: " + engineCapacity + "CC"
                + "\nColor: " + color 
                + "\nPrice: " + dailyPrice 
                + "\nRequired License: " + requiredLicense 
                + "\nPlate No: " + plateNo 
                + "\nRent Start Date: " + startDate 
                + "\nRent End Date: " + endDate;
    }
    
}