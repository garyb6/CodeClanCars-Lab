import behaviours.ICollection;
import org.junit.Before;
import org.junit.Test;
import vehicles.HybridCar;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;
    HybridCar hybridCar;

    @Before
    public void setUp(){
        hybridCar = new HybridCar("red", 2000.00, "Renault", "Leaf");
        customer = new Customer (25000.00);
        customer.addVehicle(hybridCar);

    }

    @Test
    public void canGetMoney(){
        assertEquals(25000.00, customer.getMoney(), 0.00);
    }

    @Test
    public void canGetVehicleNumber(){
        assertEquals(1, customer.getVehiclesNumber());
    }
}