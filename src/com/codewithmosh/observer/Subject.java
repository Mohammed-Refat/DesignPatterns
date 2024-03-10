package com.codewithmosh.observer;


import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject {

    List<EventHandler> observers = new ArrayList<>();

    public void addObserver(EventHandler observer){
        observers.add(observer);
    }

    public void removeObserver(EventHandler observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (var observer : observers){
            observer.handle();
        }
    }
}
















