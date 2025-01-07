public class Apartment extends Residential {
    public static int rooms;
    public Apartment(String address, double area, double price, int parkingLots, int rooms) {
        super(address, area, price, parkingLots);
        setRooms(rooms);
    }

    public static int getRooms() {
        return rooms;
    }

    public static void setRooms(int rooms) {

        if (rooms > 1) {
            Apartment.rooms = rooms;
        } else {
            Apartment.rooms = 1;
            throw new IllegalArgumentException("Rooms cannot be zero or negative.");
        }
    }
}
