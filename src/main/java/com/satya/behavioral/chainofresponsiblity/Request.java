package com.satya.behavioral.chainofresponsiblity;

public class Request {

    private RequestType type;
    private Double amount;

    public Request(RequestType type) {
        this.type = type;
    }

    public Request(RequestType type, Double amount) {
        this.type = type;
        this.amount = amount;
    }

    public RequestType getType() {
        return type;
    }

    public Double getAmount() {
        return amount;
    }
}
