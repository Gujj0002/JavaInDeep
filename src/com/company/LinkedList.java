package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class LinkedList {

    public static void main(String[] args) {

        String[] thing = {"Apple", "Mango", "banana", "kiwi"};
        List<String> listA = new java.util.LinkedList<>();

        for (String x : thing) {
            listA.add(x);
        }

        String[] moreThing = {"Watermelon", "Dragon-food"};
        List<String> listB = new java.util.LinkedList<>();

        for (String y : moreThing) {
            listB.add(y);
        }
        listA.addAll(listB);
        listB = null;

        printMe(listA);
        removeStuff(listA, 2, 5);
        printMe(listA);
        reverseMe(listA);
    }

    private static void printMe(List<String> A) {
        for (String data : A) {
            System.out.printf("%s ", data);
        }
    }

    private static void removeStuff(List<String> A, int from, int to) {
        System.out.println("\t\nlist after remove stuff....");
        A.subList(from, to).clear();
    }

    private static void reverseMe(List<String> A) {
        ListIterator<String> listIterator = A.listIterator(A.size());
        while (listIterator.hasPrevious()) {
            System.out.printf(" %s ", listIterator.previous());
        }
    }
}
