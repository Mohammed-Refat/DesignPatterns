package com.codewithmosh.observer;

import java.util.Observable;

public class Chart implements EventHandler {

    private DataSouce dataSouce;

    public Chart(DataSouce dataSouce){
        this.dataSouce = dataSouce;
    }
    @Override
    public void handle() {
        System.out.println("Chart updating: " + dataSouce.getValue());
    }



}
