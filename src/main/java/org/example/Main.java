package org.example;

import org.example.models.Grocery;

public class Main {
    public static void main(String[] args) {

        int lastResult = 1;
        while (lastResult == 1) {
            lastResult = Grocery.startGrocery();
        }
    }
}
