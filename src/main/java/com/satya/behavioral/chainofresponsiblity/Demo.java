package com.satya.behavioral.chainofresponsiblity;

public class Demo {
    public static void main(String[] args) {
        Handler director = new Director();
        Handler vp = new VP();
        Handler ceo = new CEO();
        director.addSuccessor(vp);
        vp.addSuccessor(ceo);

        director.handleRequest(new Request(RequestType.CONFERENCES));
        director.handleRequest(new Request(RequestType.PURCHASES,300.00));
        director.handleRequest(new Request(RequestType.PURCHASES,2000.00));
    }
}
