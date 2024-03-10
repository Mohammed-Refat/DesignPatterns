package com.codewithmosh.mediator;

import com.codewithmosh.observer.EventHandler;

import java.util.ArrayList;
import java.util.List;

public class UIControle {
   private List<EventHandler> eventHandlers = new ArrayList<>();

   public void addEventHandler(EventHandler observer){
       eventHandlers.add(observer);
   }


   public void notifyEventHandlers(){
       for (var observer : eventHandlers){
           observer.handle();
       }
   }
}






















