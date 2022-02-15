import behaviours.ICollection;
import behaviours.IComponent;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.HybridCar;
import vehicles.Van;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;
    Engine engine;
    Tyres tyres;
    HybridCar hybridCar;
    Van van;


    @Before
    public void setUp(){
        engine = new Engine(6, 150);
        tyres = new Tyres(4, "hard");
        hybridCar = new HybridCar("red", 2000.00, "Renault", "Leaf");
        van = new Van("white", 2500.00, "Toyota", "C-class", engine, tyres);
        customer = new Customer (25000.00);
        customer.addVehicle(hybridCar);

    }

    @Test
    public void canGetMoney(){
        assertEquals(25000.00, customer.getMoney(), 0.00);
    }

    @Test
    public void canAddVehicle(){
        customer.addVehicle(van);
        assertEquals(2, customer.getVehiclesNumber());
    }

    @Test
    public void canGetVehicleNumber(){

        assertEquals(1, customer.getVehiclesNumber());
    }
}