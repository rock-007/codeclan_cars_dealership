package dealership;

import components.Car;
import components.Engine;
import components.EngineType;
import customer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Customer customer1;
    Engine engine;
    Car car1, car2, car3;
    Dealership dealership;


    @Before

    public void before() {
        customer1 = new Customer("J565", 50000.00);
        engine = new Engine("MX51", EngineType.TWOLITERDIESEL.getEngineSize(), EngineType.TWOLITERDIESEL.getFuelType());
        car1 = new Car("Mazda", 26435.00, "silver", engine, 2500, "summer");
        car2 = new Car("Toyota", 23035.00, "Blue", engine, 2100, "winter");
        car3 = new Car("Mercezeze", 22435.00, "Black", engine, 2000, "summer");


        dealership = new Dealership("Mazda");
    }


    @Test

    public void getName() {
        assertEquals("Mazda", dealership.getName());
    }

    @Test

    public void stockStartsAtZero() {
        assertEquals(0, dealership.getCollection().size());
    }

    @Test

    public void addVehicalInStock() {
        dealership.setCollection(car1);
        assertEquals(1, dealership.getCollection().size());
    }
    @Test

    public void RemopveVehicalFromStock() {
        dealership.setCollection(car1);
         dealership.setCollection(car2);

        dealership.setCollection(car3);

        dealership.removeFromCollection(car1);
        assertEquals(2, dealership.getCollection().size());
    }

}
