package vehicles;

import behaviours.IComponent;

public class HybridCar extends Vehicle implements IComponent {
    public HybridCar(String color, int price, String make, String model) {
        super(color, price, make, model);
    }
}
