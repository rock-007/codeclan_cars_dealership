package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private Car car1;
    private Engine engine;

    @Before
    public void before() {
        engine = new Engine("MX51", EngineType.TWOLITERDIESEL.engineSize, EngineType.TWOLITERDIESEL.fuelType);
        car1 = new Car("Mazda", 26435.00, "silver", engine, 2500, "summer");

    }
    @Test
    public void canGetBrandName(){
        assertEquals("Mazda", car1.getBrandName());
    }
    @Test
    public void canGetPrice(){
        assertEquals(26435.00, car1.getPrice(),0.00);
    }
    @Test
    public void canGetColour(){
        assertEquals("silver", car1.getColor());
    }
    @Test
    public void canGetEngineSize(){
        assertEquals(2, car1.getEngine().getEngineSize());

    }
    @Test
    public void canGetTyreWidth(){
        assertEquals(2500, car1.getTyre().getWidth(),0.00);

    }
    @Test
    public void cangGetTyreSeason(){
        assertEquals("summer", car1.getTyre().getSeasons());
    }
}
