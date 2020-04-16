package edu.wctc.independentcopy.reader;

import java.util.Scanner;

public class ListReader implements Reader {

    @Override
    public String readln() {
        System.out.println("Please enter some items (each separated by commas) then press return:");

        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
