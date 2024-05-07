def park(self, vehicle):
        if len(self.available_slots) == 0:
            print("Parking lot is full.")
            return None
        slot = self.available_slots.pop(0)
        self.slots[slot] = vehicle
        print(f"Vehicle {vehicle} parked at slot {slot}")
        return slot