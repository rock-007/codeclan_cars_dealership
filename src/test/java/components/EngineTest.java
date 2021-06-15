package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before

    public void before() {
        int x =EngineType.TWOLITERDIESEL.getEngineSize();
        engine = new Engine("X232", EngineType.TWOLITERDIESEL.engineSize, EngineType.TWOLITERDIESEL.fuelType);

    }


    @Test
    public void canGetEngineNo(){

        assertEquals("X232",engine.getEngineNo());
    }
    @Test
    public void canGetEngineSize(){

        assertEquals(2,engine.getEngineSize());
    }
    @Test
    public void canGetEngineFuelType(){

        assertEquals(EngineType.TWOLITERDIESEL.fuelType,engine.getFuelType());
    }
}
