public class Vacation extends Residential {
    public static int guest;

    public Vacation(String address, double area, double price, int parkingLots, int guest) {
        super(address, area, price, parkingLots);
        setGuest(guest);
    }

    public static int getGuest() {
        return guest;
    }

    public static void setGuest(int guest) {
        Vacation.guest = guest;

        if (guest >= 1) {
            Vacation.guest = guest;
        } else {
            Vacation.guest = 1;
            throw new IllegalArgumentException("Guest number cannot be zero or negative.");
        }
    }
    public void taxIt() {
        System.out.println("Tax: 25%");
    }

    @Override
    public String toString() {
        return "Vacation: " + super.toString() + ", guest: " + getGuest();

    }
}
