public class Vehicle {
    private String brand;
    private String modelName;
    private int manufactureYear;
    private double basePrice;

    public Vehicle(String brand, String modelName, int manufactureYear, double basePrice) {
        this.brand = brand;
        this.modelName = modelName;
        this.manufactureYear = manufactureYear;
        this.basePrice = basePrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s | Model: %s | Year: %d | Price: $%.2f", 
                             brand, modelName, manufactureYear, basePrice);
    }
}
