package com.codewithmosh.command;

import com.codewithmosh.command.editor.Command;
import com.codewithmosh.command.editor.History;

public class UndoCommand implements Command {

    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        history.pop().unexecute();
    }
}
