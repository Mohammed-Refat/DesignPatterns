package com.codewithmosh;

import com.codewithmosh.chainOfResponsibility.*;
import com.codewithmosh.command.*;
import com.codewithmosh.command.editor.BoldCommand;
import com.codewithmosh.command.editor.History;
import com.codewithmosh.command.editor.UndoCommand;
import com.codewithmosh.command.fx.Button;
import com.codewithmosh.iterator.BrowseHistory;
import com.codewithmosh.iterator.Iterator;
import com.codewithmosh.mediator.ArticlesDialogBox;
import com.codewithmosh.memento.Editor;
import com.codewithmosh.observer.Chart;
import com.codewithmosh.observer.DataSouce;
import com.codewithmosh.observer.SpreadSheet;
import com.codewithmosh.state.Canvas;
import com.codewithmosh.state.SelectionTool;
import com.codewithmosh.state.abuse.StopWatch;
import com.codewithmosh.strategy.BlackAndWhiteFilter;
import com.codewithmosh.strategy.ImageStorage;
import com.codewithmosh.strategy.JpegCompressor;
import com.codewithmosh.template.AuditTrail;
import com.codewithmosh.template.GenerateReportTask;
import com.codewithmosh.template.TransferMoneyTask;
import com.codewithmosh.visitor.*;

import java.util.List;

public class Main {

    public static void main(String args[]){

     var document = new HtmlDocument();
     document.add(new HeadingNode());
     document.add(new AnchorNode());
     document.execute(new PlainTextOperation());
    }
}



















