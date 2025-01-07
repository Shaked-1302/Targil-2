abstract class Property {
    private String address;
    private double area;
    private double price;

    public Property(String address, double area, double price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.trim().isEmpty() && address.split(" ").length >= 2) {
            this.address = address;
        } else {
            this.address = "Na, na";
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area >= 0) {
            this.area = area;
        } else {
            this.area = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    @Override
    public String toString() {
        return "Address: " + address + ", Area: " + area + ", Price: " + price;
    }

    public abstract void taxIt();
}
