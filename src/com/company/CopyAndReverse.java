package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyAndReverse {

    public static void main(String[] args) {

        //Convert array into list...
        Character[] characters = {'A','B','C', 'D'};
        List<Character> list = Arrays.asList(characters);
        System.out.println("The list is: ");
        output(list);

        //Reverse list...
        Collections.reverse(list);
        System.out.println("The reverse list: ");
        output(list);

        // Copy list....
        Character[] characters1 = new Character[4];
        List<Character> list1 = Arrays.asList(characters1);
        Collections.copy(list1, list);
        System.out.println("The copy of list: ");
        output(list1);

        //fill collections with crap..
        Collections.fill(list1, 'X');
        System.out.println("After filling the list: ");
        output(list1);
    }

    private static void output(List<Character> data) {
        for (Character X : data){
            System.out.print(X);
            System.out.println();
        }
    }
}
