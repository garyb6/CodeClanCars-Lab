package vehicles;

import behaviours.ICollection;
import behaviours.IComponent;

public class HybridCar extends Vehicle implements IComponent, ICollection {

    private IComponent component;
    private IComponent component2;

    public HybridCar(String color, double price, String make, String model, IComponent component, IComponent component2) {
        super(color, price, make, model);
        this.component = component;
        this.component2 = component2;
    }

    public IComponent getComponent() {
        return this.component;
    }
}
