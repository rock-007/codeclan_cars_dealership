package customer;

import components.Car;
import components.Engine;
import components.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;
    Engine engine;
    Car car1;



    @Before
    public void before() {
        customer1 = new Customer("J565", 50000.00);
        engine = new Engine("MX51", EngineType.TWOLITERDIESEL.getEngineSize(), EngineType.TWOLITERDIESEL.getFuelType());
        car1 = new Car("Mazda", 26435.00, "silver", engine, 2500, "summer");
    }

    @Test

    public void carCollectionStartsZero() {
        assertEquals(0, customer1.getCollection().size());
    }

    @Test
    public void canGetCustomerNo() {
        assertEquals("J565", customer1.getCustomerNo());
    }

    @Test
    public void canGetCustomerMoney() {
        assertEquals(50000.00, customer1.getMoney(), 0.00);
    }

    @Test
    public void canAddCarToCollection() {
        customer1.setCollection(car1);
        assertEquals(1, customer1.getCollection().size());
    }
}
