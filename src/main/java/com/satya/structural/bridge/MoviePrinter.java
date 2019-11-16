package com.satya.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected List<Details> getDetails() {
        List<Details> details = new ArrayList<>();
        details.add(new Details("name",movie.getName()));
        details.add(new Details("year",movie.getYear()));
        details.add(new Details("runtime",movie.getRuntime()));
        return details;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }
}
