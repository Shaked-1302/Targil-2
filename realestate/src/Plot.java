enum PlotType {
    URBAN, AGRICULTURAL, INDUSTRIAL
}

class Plot extends Property {
    private PlotType type;

    public Plot(String address, double area, double price, PlotType type) {
        super(address, area, price);
        this.type = type;
    }

    public PlotType getType() {
        return type;
    }

    public void setType(PlotType type) {
        this.type = type;
    }

    @Override
    public void taxIt() {
        double taxRate = 0;
        switch (type) {
            case URBAN:
                taxRate = 0.10;
                break;
            case AGRICULTURAL:
                taxRate = 0.02;
                break;
            case INDUSTRIAL:
                taxRate = 0.05;
                break;
        }
        double tax = super.getPrice() * taxRate;
        System.out.println("Tax: " + tax + "%");
    }

    @Override
    public String toString() {
        return "Plot: " + super.toString() + ", Type: " + type;
    }
}
