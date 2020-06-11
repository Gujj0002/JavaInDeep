package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class HashSet {

    public static void main(String[] args) {

        String[] str = {"Apple", "Mango", "banana", "Mango", "kiwi","Dragon-food"};
        List<String> list = Arrays.asList(str);

        System.out.printf("%s ", list);
        System.out.println();

        // Remove elements which is used twice in list
        Set<String> set = new java.util.HashSet<>(list);
        System.out.printf("List after hash set \n%s :", set);
    }
}
