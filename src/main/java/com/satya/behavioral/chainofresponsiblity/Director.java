package com.satya.behavioral.chainofresponsiblity;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.CONFERENCES)) {
            System.out.println("Directory can approvie the request");
        }
        else{
            successor.handleRequest(request);
        }
    }
}

