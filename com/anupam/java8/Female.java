package com.anupam.java8;

/**
 * Created by anupam on 27/6/16.
 */
public interface Female {
    default public void speak() {
        System.out.println("Default Implementation in Female");
    }

}
