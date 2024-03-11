package com.codewithmosh.bridge;

public class SonyTV implements Device{

    @Override
    public void turnOn() {
        System.out.println("sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("sony: turn off");

    }

    @Override
    public void setChannel(int number) {
        System.out.println("sony: setChannel");
    }
}
