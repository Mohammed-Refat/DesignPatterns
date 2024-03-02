package com.codewithmosh.command.editor;

import com.codewithmosh.command.editor.Command;
import com.codewithmosh.command.editor.History;

public class UndoCommand implements Command {

    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(history.size() > 0)
            history.pop().unexecute();
    }
}
