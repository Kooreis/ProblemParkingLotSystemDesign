class ParkingLot:
    def __init__(self, size):
        self.size = size
        self.slots = [None] * size
        self.available_slots = list(range(size))