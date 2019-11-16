package com.satya.structural.bridge;

public class Movie {
    public String name;
    public String runtime;
    public String year;
    public String Classification;

    public Movie(String name, String runtime, String year, String classification) {
        this.name = name;
        this.runtime = runtime;
        this.year = year;
        Classification = classification;
    }

    public String getName() {
        return name;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getYear() {
        return year;
    }

    public String getClassification() {
        return Classification;
    }
}
