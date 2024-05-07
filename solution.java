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