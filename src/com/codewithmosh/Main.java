package com.codewithmosh;

import com.codewithmosh.creational.memento.Editor;
import com.codewithmosh.creational.memento.History;

import java.util.List;

public class Main {

    public static void main(String args[]){

        var editor = new Editor();
        var history = new History();

        editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("B");
        history.push(editor.createState());

        editor.setContent("C");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());


    }

}



















