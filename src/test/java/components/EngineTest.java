package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    private Engine engine;

    @Before
    public void setUp(){
        engine = new Engine(6,75);
    }

    @Test
    public void canGetCylinders(){
        assertEquals(6, engine.getCylinders());
    }

    @Test
    public void canGetBrakeHorsePower(){
        assertEquals(75, engine.getBrakeHorsePower());
    }
}