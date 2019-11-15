package com.satya.creational.factory;

public class WebsiteFactory {
    public static Website get(WebsiteType type){
        switch (type){
            case BLOG : {
                return new BlogWebsite();
            }
            case SHOPPING : {
                return new ShoppingWebsite();
            }
            default : return null;
        }
    }
}
