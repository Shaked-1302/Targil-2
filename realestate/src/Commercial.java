public class Commercial extends Property{
    public static boolean storeroom;
    public static double yield;

    public Commercial(String address, double area, double price, boolean storeroom, double yield) {
        super(address, area, price);
        setStoreroom(storeroom);
        setYield(yield);
    }
    public Commercial(String address, double area, double price, double yield) {
        super(address, area, price);
        setYield(yield);
        Commercial.storeroom = false;
    }

    public static boolean isStoreroom() {
        return storeroom;
    }

    public static void setStoreroom(boolean storeroom) {
        Commercial.storeroom = storeroom;
    }

    public double getYield() {
        return yield;
    }

    public static void setYield(double yield) {
        if (yield >= 0) {
            Commercial.yield = yield;
        } else {
            Commercial.yield = 0.0;
            throw new IllegalArgumentException("Levels cannot be negative.");
        }
    }

    public double getFutureYield(){
        return (super.getPrice() * (Commercial.yield / 100)) / 12;
    }
    @Override
    public void taxIt() {
        System.out.println("Tax: 5%");
    }

    @Override
    public String toString() {
        return "Commercial: " + super.toString() + ", storeroom: " + isStoreroom() + ", yield: " + getYield();
    }
}
