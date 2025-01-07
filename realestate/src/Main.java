import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer, Property> propertyMap = PropertyDataManager.mockProperty();

    public static void propertiesList(int price) throws PriceException{
        if(price < 0){
            throw new PriceException("The price cannot be 0 or below");
        }
        else{
            for (Map.Entry<Integer, Property> entry : propertyMap.entrySet()){
                if(entry.getValue().getPrice() == price){
                    System.out.println(entry.getValue());
                }
            }
        }

    }

    public static void financialReport(){
        for (Map.Entry<Integer, Property> entry : propertyMap.entrySet()){
            System.out.print("Tax for: "+ entry.getKey() + " is: ");
            entry.getValue().taxIt();
        }
    }

    public static void PropertiesByCity(String searchString){
        for (Map.Entry<Integer, Property> entry : propertyMap.entrySet()) {
            if (entry.getValue().getAddress().toLowerCase().contains(searchString.toLowerCase())) {
                System.out.println(entry.getValue().toString());
            }
        }
    }

    public static void NumberOfCities(){
        HashSet<String> cities = new HashSet<>();
        for (Map.Entry<Integer, Property> entry : propertyMap.entrySet()) {
            Property property = entry.getValue();
            String city = property.getAddress().split(",")[0].trim();
            cities.add(city);
        }
        System.out.println("Number of unique cities: " + cities.size());
        System.out.println("Cities:");
        for (String city : cities) {
            System.out.println(city);
        }
    }

    public static void CommercialYield(){
        double sum = 0;
        for (Map.Entry<Integer, Property> entry : propertyMap.entrySet()){
            if(entry instanceof Commercial){
                Commercial commercial = (Commercial) entry.getValue();
                sum += commercial.getYield();
            }
        }
        System.out.println("Total yield: " + sum);
    }

    public static void main(String[] args) throws PriceException {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        String stringinput;
        while (running) {
            System.out.println("Select an option:");
            System.out.println("1 > Search Properties by Price");
            System.out.println("2 > Financial Report");
            System.out.println("3 > Commercial Property Yield");
            System.out.println("4 > Properties by City");
            System.out.println("5 > Number of Cities");
            System.out.println("-1 > Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    choice = scanner.nextInt();
                    propertiesList(choice);
                    break;
                case 2:
                    financialReport();
                    break;
                case 3:
                    CommercialYield();
                    break;
                case 4:
                    stringinput = scanner.nextLine();
                    PropertiesByCity(stringinput);
                    break;
                case 5:
                    NumberOfCities();
                    break;
                case -1:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        scanner.close();
    }
}