package com.satya.behavioral.chainofresponsiblity;

public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.PURCHASES) && request.getAmount()>1000) {
            System.out.println("CEO can approvie the request");
        }else{
            System.out.println("request can not be handled");
        }
    }
}
