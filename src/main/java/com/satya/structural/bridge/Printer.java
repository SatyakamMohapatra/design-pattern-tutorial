package com.satya.structural.bridge;

import java.util.List;

public abstract class Printer {

    public String print(Formatter formatter){
        return formatter.format(getHeader(),getDetails());
    }

    protected abstract List<Details> getDetails();

    protected abstract String getHeader();

}
