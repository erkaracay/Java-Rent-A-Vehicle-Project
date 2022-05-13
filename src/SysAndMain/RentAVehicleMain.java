package SysAndMain;

import GUI.UserRegisterFrame;
import java.io.FileNotFoundException;

public class RentAVehicleMain {

    public static void main(String[] args) throws FileNotFoundException {
        VehicleSys.readFile();
        UserRegisterFrame URF = new UserRegisterFrame();

        URF.setVisible(true);
    }
}
