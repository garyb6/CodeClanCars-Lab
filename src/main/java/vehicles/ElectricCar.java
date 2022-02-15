package vehicles;

import behaviours.ICollection;
import behaviours.IComponent;

public class ElectricCar extends Vehicle implements IComponent, ICollection {

    private IComponent component;
    private IComponent component2;

    public ElectricCar(String color, double price, String make, String model, IComponent component, IComponent component2) {
        super(color, price, make, model);
    }
}
