package vehicles;

import behaviours.ICollection;
import behaviours.IComponent;

public class HybridCar extends Vehicle implements IComponent, ICollection {
    public HybridCar(String color, double price, String make, String model) {
        super(color, price, make, model);
    }
}
