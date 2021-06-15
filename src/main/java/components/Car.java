package components;

import behaviours.Vehical;

public class Car implements Vehical {

    private String brandName;
    private Double price;
    private String color;
    private Engine engine;
    private Tyres tyre;

    public Car(String brandName, Double price, String color, Engine engine, int width, String season) {
        this.brandName = brandName;
        this.price = price;
        this.color = color;
        this.engine = engine;
        this.tyre = new Tyres(width, season);

    }


    public String getBrandName() {
        return brandName;
    }

    public Double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyre() {
        return tyre;
    }

    @Override
    public String canStart() {
        return "Car can Start";
    }

    @Override
    public String canStop() {
        return "Car can Stop";
    }

    @Override
    public String canMove() {
        return "Car can move";
    }
}
