abstract class Residential extends Property{
    private int parkingLots;
    public Residential(String address, double area, double price, int parkingLots) {
        super(address, area, price);
        setParkingLots(parkingLots);
    }
    public int getParkingLots() {
        return parkingLots;
    }
    public void setParkingLots(int parkingLots) {
        if (parkingLots >= 0) {
            this.parkingLots = parkingLots;
        } else {
            this.parkingLots = 0;
            throw new IllegalArgumentException("Parking lots cannot be negative.");
        }
    }
    @Override
    public void taxIt() {
            System.out.println("Tax: 8%");
    }
}
