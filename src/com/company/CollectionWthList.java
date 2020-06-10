package com.company;

import java.util.*;

import static com.sun.tools.attach.VirtualMachine.list;

public class CollectionWthList {

    public static void main(String[] args) {
        String[] things = {"Apple", "Mango", "banana", "kiwi"};
        List<String> list = new ArrayList<>();

        // Add Array in list
        for (String x : things
        ) {
            list.add(x);
        }

        String[] moreThings = {"Mango", "banana"};
        List<String> list1 = new ArrayList<>();

        // Add Array in list
        for (String y : moreThings
        ) {
            list1.add(y);
        }

        // print out list1 members...
        for (int i = 0; i < list.size(); i++) {

            System.out.printf("%s ", list.get(i));
        }

        editList(list, list1);
        System.out.println();

        // print out list1 members...
        for (int i = 0; i < list.size(); i++) {

            System.out.printf("%s ", list.get(i));
        }

    }

    private static void editList(Collection<String> A, Collection<String> B) {

        Iterator<String> iterator = A.iterator();     // Iterator method..
        while (iterator.hasNext()) {
            if (B.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }
}
