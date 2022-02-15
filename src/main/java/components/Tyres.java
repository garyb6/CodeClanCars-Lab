package components;

import behaviours.IComponent;

public class Tyres implements IComponent {

    private int amount;
    private String type;

    public Tyres(int amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

}
