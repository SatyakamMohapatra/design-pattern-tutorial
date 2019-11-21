package com.satya.structural.flyweight;

class Order {
    private final int orderNumber;
    private final Item item;

    Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder(){
        System.out.println(String.format("Ordering %S for order number %S",item,orderNumber));
    }

}
