Here is a simple console application in C# that simulates a parking lot system with entry, exit, and slot tracking.

```C#
using System;
using System.Collections.Generic;

public class ParkingLot
{
    private int capacity;
    private int slotCount;
    private Queue<int> availableSlots;

    public ParkingLot(int capacity)
    {
        this.capacity = capacity;
        this.slotCount = 0;
        this.availableSlots = new Queue<int>();

        for (int i = 1; i <= capacity; i++)
        {
            availableSlots.Enqueue(i);
        }
    }

    public int ParkCar()
    {
        if (slotCount >= capacity)
        {
            return -1;
        }

        slotCount++;
        return availableSlots.Dequeue();
    }

    public void RemoveCar(int slot)
    {
        slotCount--;
        availableSlots.Enqueue(slot);
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        ParkingLot parkingLot = new ParkingLot(5);

        Console.WriteLine("Parking Car - Slot: " + parkingLot.ParkCar());
        Console.WriteLine("Parking Car - Slot: " + parkingLot.ParkCar());
        Console.WriteLine("Parking Car - Slot: " + parkingLot.ParkCar());

        parkingLot.RemoveCar(2);

        Console.WriteLine("Parking Car - Slot: " + parkingLot.ParkCar());
        Console.WriteLine("Parking Car - Slot: " + parkingLot.ParkCar());
        Console.WriteLine("Parking Car - Slot: " + parkingLot.ParkCar());
        Console.WriteLine("Parking Car - Slot: " + parkingLot.ParkCar());

        Console.ReadLine();
    }
}
```

This program creates a parking lot with a specified capacity. When a car is parked, it is assigned the next available slot. When a car leaves, its slot becomes available again. If the parking lot is full, the `ParkCar` method will return -1.