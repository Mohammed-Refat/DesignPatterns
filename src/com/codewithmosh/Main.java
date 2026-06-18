package com.codewithmosh;

import com.codewithmosh.creational.memento.Editor;
import com.codewithmosh.creational.memento.History;
import com.codewithmosh.creational.state.BrushTool;
import com.codewithmosh.creational.state.Canvas;

import java.util.List;

public class Main {

    public static void main(String args[]){

        var canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.moveUp();
        canvas.moveDown();



    }

}



















