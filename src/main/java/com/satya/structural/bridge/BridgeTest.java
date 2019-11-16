package com.satya.structural.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Movie movie = new Movie("John Wick","2 hr","2019","Action");

        Formatter printFormatter = new printFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        String value = moviePrinter.print(printFormatter);
        System.out.println(value);
        System.out.println("\n");
        Formatter htmlFormator = new htmlFormatter();
        value = moviePrinter.print(htmlFormator);
        System.out.println(value);

    }
}
