package com.satya.structural.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        TwitterService twitterService = (TwitterService) SecurityProxy.newInstace(new TwitterServiceImpl());
        System.out.println(twitterService.getTimeLine());
        System.out.println(twitterService.postToTimeLine("hello"));
    }
}
