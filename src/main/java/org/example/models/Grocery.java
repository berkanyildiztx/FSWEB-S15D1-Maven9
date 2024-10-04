package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {

    public static ArrayList groceryList = new ArrayList();

    public static int startGrocery() {

        Scanner scanner = new Scanner(System.in);

        int userSelection = scanner.nextInt();

        switch (userSelection) {

            case 0:
                return 0;

            case 1:
                System.out.print("Eklenmesini istediğiniz elemanları giriniz.\n");

                String groceriesToAddInput = scanner.next();

                String[] groceriesToAdd = groceriesToAddInput.split(",");

                for (String groceryToAdd : groceriesToAdd) {
                    if (!groceryList.contains(groceryToAdd.trim()))
                        groceryList.add(groceryToAdd.trim());
                }

                System.out.println(groceryList);

                return 1;

            case 2:
                System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.\n");

                String groceriesToRemoveInput = scanner.next();

                String[] groceriesToRemove = groceriesToRemoveInput.split(",");

                for (String groceryToRemove : groceriesToRemove) {
                    groceryList.remove(groceryToRemove.trim());
                }

                System.out.println(groceryList);

                return 1;

            default:

                throw new RuntimeException("Option is not supported.");
        }
    }

    public static void addItems(String input) {

        String[] inputParts = input.split(",");

        for (String inputPart: inputParts) {
            if (!groceryList.contains(inputPart))
                groceryList.add(inputPart);
        }

        Collections.sort(groceryList);
    }


    public static void removeItems(String input) {

        String[] inputParts = input.split(",");

        for (String inputPart: inputParts) {
            groceryList.remove(inputPart);
        }

        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {

        Collections.sort(groceryList);

        System.out.println(groceryList);
    }
}
