package SysAndMain;

import Vehicle.Vehicle;
import Vehicles.Car;
import Vehicles.Caravan;
import Vehicles.EScooter;
import Vehicles.Motorcycle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class VehicleSys {
    private static ArrayList<Vehicle> vehicleList = new ArrayList();
    
    public static void readFile() throws FileNotFoundException {
        File fileCar = new File("cars.txt");
        File fileCaravan = new File("caravans.txt");
        File fileEscooter = new File("escooters.txt");
        File fileMotorcycle = new File("motorcycles.txt");
        
        Scanner carInput = new Scanner(fileCar);
        Scanner caravanInput = new Scanner(fileCaravan);
        Scanner escooterInput = new Scanner(fileEscooter);
        Scanner motorInput = new Scanner(fileMotorcycle);
        
        Car car;
        while (carInput.hasNext()) {
            String str = carInput.nextLine();
            String[] arr = str.split("-");
            car = new Car(Double.parseDouble(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), arr[3], arr[4],
                    Integer.parseInt(arr[5]), arr[6], Integer.parseInt(arr[7]), arr[8], Double.parseDouble(arr[9]), arr[10], arr[11], arr[12]);
            
            car.calcRequiredLicense();
            VehicleSys.addVehicle(car);
        }
        
        Caravan caravan;
        while (caravanInput.hasNext()) {
            String str = caravanInput.nextLine();
            String[] arr = str.split("-");
            caravan = new Caravan(Double.parseDouble(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), arr[3], arr[4], 
                    Integer.parseInt(arr[5]), arr[6], Integer.parseInt(arr[7]), arr[8], Double.parseDouble(arr[9]), Integer.parseInt(arr[10]),
                    Double.parseDouble(arr[11]), Boolean.parseBoolean(arr[12]), Boolean.parseBoolean(arr[13]), arr[14], arr[15]);
            
            caravan.calcRequiredLicense();
            VehicleSys.addVehicle(caravan);
        }
        
        Motorcycle motorcycle;
        while (motorInput.hasNext()) {
            String str = motorInput.nextLine();
            String[] arr = str.split("-");
            motorcycle = new Motorcycle(Double.parseDouble(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), arr[3], arr[4],
                    Integer.parseInt(arr[5]), arr[6], Integer.parseInt(arr[7]), arr[8], Double.parseDouble(arr[9]), arr[10], 
                    Integer.parseInt(arr[11]), Boolean.parseBoolean(arr[12]));
            
            motorcycle.calcRequiredLicense();
            VehicleSys.addVehicle(motorcycle);
        }

        EScooter escooter;
        while (escooterInput.hasNext()) {
            String str = escooterInput.nextLine();
            String[] arr = str.split("-");
            escooter = new EScooter(Double.parseDouble(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), arr[3], arr[4],
                    Integer.parseInt(arr[5]), arr[6], Integer.parseInt(arr[7]), arr[8], Double.parseDouble(arr[9]), Double.parseDouble(arr[10]),
                    Integer.parseInt(arr[11]), Double.parseDouble(arr[12]));
                        
            VehicleSys.addVehicle(escooter);
        }
    }
    
    public static boolean addVehicle(Vehicle v) {
        if (!checkVehicle(v)) {
            vehicleList.add(v);
            return true;
        }
        
        return false;
    }
    
    public static boolean checkVehicle(Vehicle v) {
        for (Vehicle vehicle: vehicleList) {
            if(vehicle.getPlateNo().equals(v.getPlateNo()))
                return true;
        }
        
        return false;
    }
    
    public static Vehicle removeVehicle(Vehicle v) {
        Vehicle ret;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getPlateNo().equals(vehicle.getPlateNo())) {
                ret = vehicle;
                vehicleList.remove(v);
                return ret;
            }
        }
        
        return null;
    }
    
    public static Vehicle searchVehicle(String model) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getModel().equalsIgnoreCase(model))
                return vehicle;
        }
        return null;
    }
    
    public static ArrayList<Vehicle> searchVehicleAccToLicense(String licenseType) {
        ArrayList<Vehicle> ret = new ArrayList();
        
        for (Vehicle vehicle : vehicleList) {
            if(vehicle.getRequiredLicense().equals(licenseType) && ret.indexOf(vehicle) == -1)
                ret.add(vehicle);
        }
        
        return ret;
    }
    
    public static double calculateFee() {
        double discountPrc, totalFee = 0;
        
        for (Vehicle vehicle : vehicleList) {
            Date sDate = vehicle.getStartDate();

            Date eDate = vehicle.getEndDate();

            long sDateMs = sDate.getTime();
            long eDateMs = eDate.getTime();

            long timeDiff = 0;
            if(sDateMs > eDateMs) {
                    timeDiff = sDateMs - eDateMs;
            } else {
                    timeDiff = eDateMs - sDateMs;
            }

            int daysDiff = (int) (timeDiff / (1000 * 60 * 60 * 24));
            
            if (daysDiff < 7)
                discountPrc = 1;
            else if (daysDiff < 30)
                discountPrc = .95;
            else if (daysDiff <= 180)
                discountPrc = 0.85;
            else
                discountPrc = 0.75;
            
            totalFee += vehicle.getDailyPrice() * daysDiff * discountPrc;
        }
        
        return totalFee;
    }
    
    public static String display() {
        String ret = "";
        
        for (Vehicle vehicle : vehicleList)
            ret += vehicle;
        
        return ret;
    }
}