package com.satya.structural.decorator;

public class DressingSandwtch extends SandwitchDecorator {


    public DressingSandwtch(Sandwitch customSandwitch) {
        super(customSandwitch);
    }

    @Override
    public String make() {
        return customSandwitch.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }
}
