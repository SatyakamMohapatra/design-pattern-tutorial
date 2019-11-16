package com.satya.structural.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        final Sandwitch sandwitch = new SimpleSandwitch();
        final Sandwitch addDressing = new DressingSandwtch(sandwitch);
        final Sandwitch addMeat = new MeatSandwtch(addDressing);

        //final
        System.out.println(addMeat.make());
    }
}
