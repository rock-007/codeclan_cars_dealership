package dealership;

import behaviours.Vehical;
import components.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dealership {
    private String name;
    private ArrayList<Vehical> collection;

    public Dealership(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehical> getCollection() {
        return collection;
    }

    public void setCollection(Vehical vehical) {
        this.collection.add(vehical);
    }

    public void removeFromCollection(Car car1) {

        ArrayList<Vehical> test = collection;
        for (Vehical eachCar : test) {
            if (eachCar == car1) {
                collection.remove(car1);
                break;
            }
        }
    }
}
