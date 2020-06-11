package com.company;

public class GenericMethods {

    public static void main(String[] args) {

        Integer[] integers = {1,2,3,4,5};
        Character[] characters = {'A','B','C','D'};

        printMe(integers);
        printMe(characters);


        System.out.println(max("Apple","Toast","Mango"));
    }

    private static <T>  void printMe(T[] X) {
        for (T list : X){
            System.out.printf("%s ", list);
            System.out.print("");
        }
    }
    public static <T extends Comparable<T>> T max (T a, T b, T c){
        T maxNumber = a;
        if (b.compareTo(a) > 0){
            return maxNumber = b;
        }
        if (c.compareTo(maxNumber) > 0){
            return maxNumber = c;
        }
        return maxNumber;
    }

}
