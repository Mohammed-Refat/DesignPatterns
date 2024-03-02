package com.codewithmosh.strategy;

import org.w3c.dom.ls.LSOutput;

public class BlackAndWhiteFilter implements Filter{


    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W filter");
    }
}
