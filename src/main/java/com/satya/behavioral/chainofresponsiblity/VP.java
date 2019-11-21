package com.satya.behavioral.chainofresponsiblity;

public class VP extends Handler{

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.PURCHASES) && request.getAmount()<1000) {
            System.out.println("VP can approvie the request");
        }
        else {
            successor.handleRequest(request);
        }
    }
}
