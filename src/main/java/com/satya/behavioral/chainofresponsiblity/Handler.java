package com.satya.behavioral.chainofresponsiblity;

public abstract class Handler {

    protected Handler successor;

    protected void addSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
