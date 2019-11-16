package com.satya.structural.decorator;

public class MeatSandwtch extends SandwitchDecorator {

    public MeatSandwtch(Sandwitch customSandwitch) {
        super(customSandwitch);
    }

    @Override
    public String make() {
        return customSandwitch.make() + addMeat();
    }

    private String addMeat() {
        return " + Chicken";
    }
}
