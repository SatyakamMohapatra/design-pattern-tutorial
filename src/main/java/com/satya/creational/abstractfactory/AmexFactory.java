package com.satya.creational.abstractfactory;

public class AmexFactory extends CreditCardAbstractFactory {

    @Override
    public AmexCreditCard getCreditCard(CreditCardType type) {
        switch (type) {
            case GOLD: {
                return new AmexGoldCreditCard();
            }
            case PLATANUM: {
                return new AmexPlatinumCreditCard();
            }
            default:
                return null;
        }
    }
}
