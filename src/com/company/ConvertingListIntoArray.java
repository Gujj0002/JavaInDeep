package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class ConvertingListIntoArray {

    public static void main(String[] args) {

        String[] stuff = {"Apple", "Mango", "banana", "kiwi"};
        LinkedList<String> List = new LinkedList<>(Arrays.asList(stuff));

        List.add("Dragon-food");
        List.addFirst("Watermelon");

        //Converting list into Array ....
        stuff = List.toArray(new String[List.size()]);

        for (String x : stuff){
            System.out.printf("%s ", x);
        }

    }
}
