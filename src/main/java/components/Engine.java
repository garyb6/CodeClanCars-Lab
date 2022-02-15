package components;

import behaviours.IComponent;

public class Engine implements IComponent {

    private int cylinders;
    private int brakeHorsePower;

    public Engine(int cylinders, int brakeHorsePower) {
        this.cylinders = cylinders;
        this.brakeHorsePower = brakeHorsePower;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBrakeHorsePower() {
        return brakeHorsePower;
    }
}
