package com.satya.creational;

public class MySingleton {

    private static MySingleton instance  = null;

    private MySingleton() {
        //avoid object creation via reflection
        if (instance != null) {
            throw new RuntimeException("object can not be created using reflection");
        }
    }

    public static MySingleton getInstance(){
        if (instance == null) {
            synchronized (MySingleton.class){
                if(instance == null){
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
}
