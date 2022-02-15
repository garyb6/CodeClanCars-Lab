package vehicles;

import behaviours.IComponent;

public class ElectricCar extends Vehicle implements IComponent {
    public ElectricCar(String color, int price, String make, String model) {
        super(color, price, make, model);
    }
}
