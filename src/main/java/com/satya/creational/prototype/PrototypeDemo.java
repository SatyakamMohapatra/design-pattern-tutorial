package com.satya.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItems("Movie");
        movie.setTitle("Java Satya");

        Movie movie2 = (Movie) registry.createItems("Movie");
        movie2.setTitle("Java Satya prequel");

        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getUrl());
        System.out.println(movie.getRuntime());

        System.out.println(movie2);
        System.out.println(movie2.getTitle());
        System.out.println(movie2.getPrice());
        System.out.println(movie2.getUrl());
        System.out.println(movie2.getRuntime());
    }
}
