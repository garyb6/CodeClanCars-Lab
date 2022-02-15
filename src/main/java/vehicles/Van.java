package vehicles;

import behaviours.ICollection;
import behaviours.IComponent;

public class Van extends Vehicle implements IComponent, ICollection {
    public Van(String color, double price, String make, String model) {
        super(color, price, make, model);
    }
}
