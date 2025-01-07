public class Villa extends Residential {
    public static int levels;
    public Villa(String address, double area, double price, int parkingLots, int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    public static int getLevels() {
        return levels;
    }

    public static void setLevels(int levels) {
        if (levels >= 1) {
            Villa.levels = levels;
        } else {
            Villa.levels = 1;
            throw new IllegalArgumentException("Levels cannot be zero or negative.");
        }
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() + ", levels: " + getLevels();

    }
}
