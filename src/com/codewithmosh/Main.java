package com.codewithmosh;

import com.codewithmosh.creational.iterator.BrowseHistory;
import com.codewithmosh.creational.iterator.Iterator;
import com.codewithmosh.creational.memento.Editor;
import com.codewithmosh.creational.memento.History;
import com.codewithmosh.creational.state.BrushTool;
import com.codewithmosh.creational.state.Canvas;

import java.util.List;

public class Main {

    public static void main(String args[]){


        // Iterator pattern
        var history = new BrowseHistory();

        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while(iterator.hasNext())
        {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }




//       State pattern
//        var canvas = new Canvas();
//        canvas.setCurrentTool(new BrushTool());
//        canvas.moveUp();
//        canvas.moveDown();





    }

}



















