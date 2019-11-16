package com.satya.structural.decorator;

public abstract class SandwitchDecorator implements Sandwitch{

    protected Sandwitch customSandwitch;

    public SandwitchDecorator(Sandwitch customSandwitch){
        this.customSandwitch = customSandwitch;
    }

    @Override
    public String make() {
        return customSandwitch.make();
    }
}
