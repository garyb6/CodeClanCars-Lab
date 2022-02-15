import behaviours.ICollection;

import java.util.ArrayList;

public class Dealership implements ICollection {

    private double till;
    private ArrayList<ICollection> vehicles;

    public Dealership(double till, ArrayList<ICollection> vehicles) {
        this.till = till;
        this.vehicles = vehicles;
    }

    public double getTill() {
        return till;
    }

    public int getVehiclesNumber() {
        return vehicles.size();
    }
}
