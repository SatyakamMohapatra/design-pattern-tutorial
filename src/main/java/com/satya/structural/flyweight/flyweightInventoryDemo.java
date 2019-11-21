package com.satya.structural.flyweight;

public class flyweightInventoryDemo {


    public static void main(String[] args) {
        IndentorySystem ims = new IndentorySystem();
        ims.takeOrder("Roombs", 221);
        ims.takeOrder("Roombs", 321);
        ims.takeOrder("Roombs", 432);
        ims.takeOrder("Samsung TV", 123);
        ims.takeOrder("Samsung TV", 4312);
        ims.takeOrder("Samsung TV", 5435);

        ims.process();

        System.out.println(ims.report());
    }
}
