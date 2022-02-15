package vehicles;

public abstract class Vehicle {

    private String color;
    private double price;
    private String make;
    private String model;

    public Vehicle(String color, double price, String make, String model){
        this.color = color;
        this.price = price;
        this.make = make;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
