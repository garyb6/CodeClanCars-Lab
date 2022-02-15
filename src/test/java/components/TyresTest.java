package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TyresTest {

    private Tyres tyres;

    @Before
    public void setUp(){
        tyres = new Tyres(4, "soft");
    }

    @Test
    public void canGetAmount(){
        assertEquals(4, tyres.getAmount());
    }

    @Test
    public void canGetType(){
        assertEquals("soft", tyres.getType());
    }

}