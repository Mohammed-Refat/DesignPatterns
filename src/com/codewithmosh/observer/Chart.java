package com.codewithmosh.observer;

import javax.xml.crypto.Data;

public class Chart implements Observer{

    private DataSouce dataSouce;

    public Chart(DataSouce dataSouce){
        this.dataSouce = dataSouce;
    }
    @Override
    public void update() {
        System.out.println("Chart updating: " + dataSouce.getValue());
    }
}
