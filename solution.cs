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
}