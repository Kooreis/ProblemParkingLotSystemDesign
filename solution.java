import java.util.*;

class Car {
    private String registrationNo;
    private int driverAge;

    public Car(String registrationNo, int driverAge) {
        this.registrationNo = registrationNo;
        this.driverAge = driverAge;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public int getDriverAge() {
        return driverAge;
    }
}