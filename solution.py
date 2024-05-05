```python
class ParkingLot:
    def __init__(self, size):
        self.size = size
        self.slots = [None] * size
        self.available_slots = list(range(size))

    def park(self, vehicle):
        if len(self.available_slots) == 0:
            print("Parking lot is full.")
            return None
        slot = self.available_slots.pop(0)
        self.slots[slot] = vehicle
        print(f"Vehicle {vehicle} parked at slot {slot}")
        return slot

    def exit(self, slot):
        if slot >= self.size or self.slots[slot] is None:
            print("Invalid slot.")
            return None
        vehicle = self.slots[slot]
        self.slots[slot] = None
        self.available_slots.append(slot)
        self.available_slots.sort()
        print(f"Vehicle {vehicle} exited from slot {slot}")
        return vehicle

    def status(self):
        for i in range(self.size):
            if self.slots[i] is not None:
                print(f"Slot {i} occupied by vehicle {self.slots[i]}")
            else:
                print(f"Slot {i} is empty")


if __name__ == "__main__":
    parking_lot = ParkingLot(5)
    parking_lot.park("Car1")
    parking_lot.park("Car2")
    parking_lot.park("Car3")
    parking_lot.status()
    parking_lot.exit(1)
    parking_lot.status()
    parking_lot.park("Car4")
    parking_lot.status()
```