package com.satya.creational.factory;

public class BlogWebsite extends Website {
    @Override
    public void createWebsite() {
        pages.add(new AboutPages());
        pages.add(new ContactPage());
        pages.add(new SearchPages());
        pages.add(new PostPages());
    }
}
