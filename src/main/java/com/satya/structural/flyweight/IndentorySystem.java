package com.satya.structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IndentorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    public void takeOrder(String itemName, int OrderNumber){
        Item item = catalog.lookup(itemName);
        Order order = new Order(OrderNumber,item);
        orders.add(order);
    }

    public void process(){
        orders.stream().forEach(order -> {
            order.processOrder();
            orders.remove(order);
        });
    }

    public String report(){
        return "\nTotal Item object managed: "+ catalog.totalItemsMade();
    }
}
