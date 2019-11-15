package com.satya.creational.factory;

public class ShoppingWebsite extends Website {
    @Override
    public void createWebsite() {
        pages.add(new AboutPages());
        pages.add(new ContactPage());
        pages.add(new CartPages());
    }
}
