package com.satya.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.get(WebsiteType.BLOG);
        Website shop = WebsiteFactory.get(WebsiteType.SHOPPING);

        System.out.println(blog.getPages());
        System.out.println(shop.getPages());

    }
}
