package UserAndLicense;

import java.util.ArrayList;

public class License {
    private ArrayList<String> types = new ArrayList();
    private int year;

    public License(int year) {
        this.year = year;
    }

    public boolean checkType(String licenseType) {
        for (String type : types) {
            if (licenseType.equalsIgnoreCase(type))
                return true;
        }
        return false;
    }
    
    public ArrayList<String> getTypes() {
        return types;
    }

    public int getYear() {
        return year;
    }

    public boolean addType(String type) {
        if (!checkType(type)) {
            types.add(type);
            return true;
        }
        return false;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}