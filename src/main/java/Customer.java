import behaviours.ICollection;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<ICollection> vehicles;

    public Customer(double money, ArrayList<ICollection> vehicles) {
        this.money = money;
        this.vehicles = vehicles;
    }

    public double getMoney() {
        return money;
    }

    public int getVehiclesNumber() {
        return vehicles.size();
    }
}
