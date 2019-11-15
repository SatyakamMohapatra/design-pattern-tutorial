package com.satya.creational.abstractfactory;

public class VisaFactory extends CreditCardAbstractFactory {

    @Override
    public VisaCreditCard getCreditCard(CreditCardType type) {
        switch (type) {
            case GOLD: {
                return new VisaGoldCreditCard();
            }
            case PLATANUM: {
                return new VisaPlataniumCreditCard();
            }
            default:
                return null;
        }
    }
}
