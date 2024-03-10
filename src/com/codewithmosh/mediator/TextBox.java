package com.codewithmosh.mediator;

public class TextBox extends UIControle{
    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }
}
