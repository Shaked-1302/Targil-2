import java.util.ArrayList;

public class RealEstateManager {
    public static String name;
    ArrayList<Property> properties;

    public RealEstateManager(String name) {
        RealEstateManager.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        RealEstateManager.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Property property){
        properties.add(property);
    }

    public ArrayList<Property> getSamePrice(int price){
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        ArrayList<Property> samePrice = null;
        for(Property p : properties){
            if(p.getPrice() == price){
                samePrice.add(p);
            }
        }
        return samePrice;
    }

    public int totalPrice(){
        int total = 0;
        for(Property p : properties){
            total += p.getPrice();
        }
        return total;
    }
}
