package vehicles;

import behaviours.IComponent;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HybridCarTest {

    private HybridCar hybridCar;
    private Engine engine;
    private Tyres tyres;

    @Before
    public void setUp(){
        engine = new Engine(6, 150);
        tyres = new Tyres(4, "hard");
        hybridCar = new HybridCar("blue", 10000.00, "Renault", "Van1", engine, tyres);
    }

    @Test
    public void hasIComponentComponent(){
        IComponent component = hybridCar.getComponent();
        assertNotNull(component);
    }
}