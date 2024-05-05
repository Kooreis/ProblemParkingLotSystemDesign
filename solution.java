Here is a simple console-based solution for a parking lot system in Java. This solution includes classes for ParkingLot, Car, and Slot. The ParkingLot class includes methods for parking a car, removing a car, and checking the status of the parking lot.

```java
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

class Slot {
    private int slotNumber;
    private Car parkedCar;

    public Slot(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean isSlotFree() {
        return this.parkedCar == null;
    }

    public void park(Car car) {
        this.parkedCar = car;
    }

    public void removeCar() {
        this.parkedCar = null;
    }

    public Car getParkedCar() {
        return this.parkedCar;
    }
}

class ParkingLot {
    private Slot[] slots;

    public ParkingLot(int numberOfSlots) {
        this.slots = new Slot[numberOfSlots];
        for (int i = 0; i < numberOfSlots; i++) {
            slots[i] = new Slot(i + 1);
        }
    }

    public void parkCar(String registrationNo, int driverAge) {
        for (Slot slot : slots) {
            if (slot.isSlotFree()) {
                slot.park(new Car(registrationNo, driverAge));
                System.out.println("Car with vehicle registration number \"" + registrationNo + "\" has been parked at slot number " + slot.getParkedCar().getRegistrationNo());
                return;
            }
        }
        System.out.println("Parking lot is full.");
    }

    public void removeCar(int slotNumber) {
        if (slots[slotNumber - 1].isSlotFree()) {
            System.out.println("No car is parked at slot number " + slotNumber);
        } else {
            slots[slotNumber - 1].removeCar();
            System.out.println("Slot number " + slotNumber + " vacated.");
        }
    }

    public void getParkingLotStatus() {
        for (Slot slot : slots) {
            if (!slot.isSlotFree()) {
                System.out.println("Slot number: " + slot.getParkedCar().getRegistrationNo() + " occupied by a car with vehicle registration number \"" + slot.getParkedCar().getRegistrationNo() + "\"");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.parkCar("KA-01-HH-1234", 21);
        parkingLot.parkCar("PB-01-HH-9999", 22);
        parkingLot.getParkingLotStatus();
        parkingLot.removeCar(1);
        parkingLot.getParkingLotStatus();
    }
}
```

This is a very basic implementation and does not include any user input or error handling. It also assumes that each car has a unique registration number and each slot can only hold one car.