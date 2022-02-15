package vehicles;

import components.Engine;
import components.Tyres;
import org.junit.Before;

import static org.junit.Assert.*;

public class ElectricCarTest {

    private ElectricCar electricCar;
    private Engine engine;
    private Tyres tyres;

    @Before
    public void setUp(){
        electricCar = new ElectricCar("red", 2000, "BMW", "4-type", engine, tyres);
    }

}