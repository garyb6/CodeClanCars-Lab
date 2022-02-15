package vehicles;

import behaviours.ICollection;
import behaviours.IComponent;

public class ElectricCar extends Vehicle implements IComponent, ICollection {
    public ElectricCar(String color, double price, String make, String model) {
        super(color, price, make, model);
    }
}
