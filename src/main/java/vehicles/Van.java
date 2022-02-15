package vehicles;

import behaviours.ICollection;
import behaviours.IComponent;

public class Van extends Vehicle implements IComponent {
    public Van(String color, int price, String make, String model) {
        super(color, price, make, model);
    }
}
