package customer;

import behaviours.Vehical;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Vehical> collection;
    private Double money;
    private String customerNo;

    public Customer(String customerNo, Double money) {
        this.customerNo = customerNo;
        this.collection = new ArrayList<>();
        this.money = money;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public ArrayList<Vehical> getCollection() {
        return collection;
    }

    public void setCollection(Vehical vehical) {
        this.collection.add(vehical);
    }

    public Double getMoney() {
        return money;
    }
}
