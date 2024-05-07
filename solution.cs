public int ParkCar()
    {
        if (slotCount >= capacity)
        {
            return -1;
        }

        slotCount++;
        return availableSlots.Dequeue();
    }