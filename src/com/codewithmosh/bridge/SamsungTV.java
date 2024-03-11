package com.codewithmosh.bridge;

public class SamsungTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("samsung: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("samsung: turnOff");

    }

    @Override
    public void setChannel(int number) {
        System.out.println("samsung: setChannel");

    }
}
