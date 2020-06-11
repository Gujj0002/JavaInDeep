package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionWithSorting {

    public static void main(String[] args) {

        String[] str = {"Apple", "Mango", "banana", "kiwi","Dragon-food"};

        List<String> list = Arrays.asList(str);    // Convert array in list...

        Collections.sort(list);
        System.out.printf("%s\n", list);

        Collections.sort(list, Collections.reverseOrder());   // reverse the list...
        System.out.printf("%s\n", list);

    }
}
