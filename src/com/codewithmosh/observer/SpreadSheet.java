package com.codewithmosh.observer;

public class SpreadSheet implements EventHandler {
    private DataSouce dataSouce;
    public SpreadSheet(DataSouce dataSouce){
        this.dataSouce = dataSouce;
    }
    @Override
    public void handle() {
        System.out.println("Spread Sheet: " + dataSouce.getValue());
    }
}
