package com.codewithmosh.observer;

public class SpreadSheet implements Observer{
    private DataSouce dataSouce;
    public SpreadSheet(DataSouce dataSouce){
        this.dataSouce = dataSouce;
    }
    @Override
    public void update() {
        System.out.println("Spread Sheet: " + dataSouce.getValue());
    }
}
