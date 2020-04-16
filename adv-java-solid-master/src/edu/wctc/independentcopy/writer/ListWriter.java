package edu.wctc.independentcopy.writer;

import java.util.Arrays;

public class ListWriter implements Writer {

    @Override
    public void writeln(String line) {
        System.out.println("Here is the list you entered, which I've copied below.");
        String[] values = line.split(",");
        for (String value : values) {
            System.out.println(value);
        }
    }
}
