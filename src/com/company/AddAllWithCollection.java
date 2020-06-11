package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddAllWithCollection {

    public static void main(String[] args) {

        String[] strings = {"Apple", "Mango", "banana", "kiwi", "Dragon-food" };
        List<String> list = Arrays.asList(strings);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Watermelon");
        arrayList.add("Chicken");

        for (String X : arrayList) {
            System.out.printf("%s ", X);
            System.out.println();
        }

        Collections.addAll(arrayList, strings);

        for (String Y : arrayList) {
            System.out.printf("%s ", Y);
        }

        // Check word frequency in list....
        System.out.println(Collections.frequency(arrayList, "Mango"));

        boolean A = Collections.disjoint(arrayList, list);
        System.out.println(A);

        if (A) {
            System.out.print("There is nothing in common in lists.");
        } else {
            System.out.print("There is something in common in lists.");
        }

    }
}
