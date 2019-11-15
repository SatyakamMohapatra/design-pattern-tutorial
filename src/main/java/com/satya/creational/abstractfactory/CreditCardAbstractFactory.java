package com.satya.creational.abstractfactory;

public abstract class CreditCardAbstractFactory {

    public static CreditCardAbstractFactory getCreditCardFactory(int creditScore){

        if(creditScore > 750){
            return new AmexFactory();
        }else{
            return new VisaFactory();
        }

    }

    public abstract CreditCard getCreditCard(CreditCardType cardType);

}
