import behaviours.ICollection;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<ICollection> vehicles;

    public Customer(double money) {
        this.money = money;
        this.vehicles = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public int getVehiclesNumber() {
        return vehicles.size();
    }

    public void addVehicle(ICollection vehicle){
        this.vehicles.add(vehicle);
    }
}
