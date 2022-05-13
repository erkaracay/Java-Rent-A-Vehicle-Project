package UserAndLicense;

import java.util.ArrayList;

public class UserInfo {
    private String name;
    private  License license;
    private int age;

    public UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public License getLicenseList() {
        return license;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLicenseList(License license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "User Info" +
                "\nName: " + name +
                "\nAge: " + age;
    }

}