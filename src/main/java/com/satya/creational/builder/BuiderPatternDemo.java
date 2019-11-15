package com.satya.creational.builder;

public class BuiderPatternDemo {
    public static void main(String[] args) {
        LunchOrderBuilder orderBuilder = new LunchOrderBuilder.Builder().bread("corn")
                                                                .confiments("luctus")
                                                                .meat("chicken")
                                                                .dreassing("bbq")
                                                                .dreassing("sto")
                                                                .build();

        System.out.println(orderBuilder.getDreassing());
    }
}
