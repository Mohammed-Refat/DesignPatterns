package com.codewithmosh.mediator;

public class ListBox extends UIControle{
    private String selection;


    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }
}
