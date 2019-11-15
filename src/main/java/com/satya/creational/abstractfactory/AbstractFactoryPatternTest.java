package com.satya.creational.abstractfactory;

public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        CreditCardAbstractFactory abstractFactory = CreditCardAbstractFactory.getCreditCardFactory(650);
        CreditCard creditCard = abstractFactory.getCreditCard(CreditCardType.GOLD);

        CreditCardAbstractFactory abstractFactory2 = CreditCardAbstractFactory.getCreditCardFactory(800);
        CreditCard creditCard2 = abstractFactory.getCreditCard(CreditCardType.PLATANUM);

        System.out.println(creditCard);
        System.out.println(creditCard2);
    }
}
