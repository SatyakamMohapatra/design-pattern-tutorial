package com.satya.creational;

import com.satya.creational.singleton.MySingleton;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySingletonTest {
    private MySingleton mySingletonObject1 = null;
    private MySingleton mysSingletonObject2 = null;


    @BeforeEach
    void setUp() {
        mySingletonObject1 = MySingleton.getInstance();
        mysSingletonObject2 = MySingleton.getInstance();

    }

    @Test
    void getInstance() {
        assertSame(mySingletonObject1,mysSingletonObject2);
    }
}