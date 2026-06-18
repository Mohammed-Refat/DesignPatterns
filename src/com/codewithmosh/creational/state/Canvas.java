package com.codewithmosh.creational.state;

public class Canvas {

    private Tool currentTool;
    public void moveDown(){
        currentTool.mouseDown();
    }
    public void moveUp(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
