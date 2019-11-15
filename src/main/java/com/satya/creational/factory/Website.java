package com.satya.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Pages> pages = new ArrayList<>();

    public List<Pages> getPages() {
        return pages;
    }

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();
}
