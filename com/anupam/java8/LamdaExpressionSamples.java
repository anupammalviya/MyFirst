package com.anupam.java8;

/**
 * Created by anupam on 27/6/16.
 */
public class LamdaExpressionSamples {
    public static void main(String[] args) {


        Thread thread = new Thread(() -> { System.out.println("Hello World"); });
        thread.start();
    }
}
