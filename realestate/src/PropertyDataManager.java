import java.util.HashMap;

class PropertyDataManager {
    public static HashMap<Integer, Property> mockProperty() {
        HashMap<Integer, Property> property = new HashMap<>();
        property.put(1, new Plot("beit berl, tcharnehovski 69", 100, 14000000, PlotType.INDUSTRIAL));
        property.put(2, new Plot("ber sheva, kehilat tzion 44", 78, 1900000, PlotType.INDUSTRIAL));
        property.put(3, new Apartment("or yehuda, Haazmaut 87", 120, 34000000, 2, 4));
        property.put(4, new Apartment("sigma, sigma 420", 23, 120000, 0, 2));
        property.put(5, new Villa("herzelia, ganey tchelet 13", 600, 43000000, 3, 2));
        property.put(6, new Villa("herzelia, ganey tchelet 13", 400, 22000000, 1, 4));
        property.put(7, new Vacation("kazachstan, kordistan 123", 71, 10000, 1, 2));
        property.put(8, new Vacation("iran, neve azlanoot 21", 54, 10000, 0, 1));
        property.put(9, new Commercial("Jerusalem, Hakotel 100", 23, 40000, true, 2));
        property.put(10, new Commercial("Tel Aviv, Allenby Street 2", 40, 100000, true, 4));
        property.put(11, new Office("Jerusalem, Derech Ruppin 11", 12, 1200));
        property.put(12, new Office("Tel Aviv, King George 63", 10, 500));

        return property;
    }

}