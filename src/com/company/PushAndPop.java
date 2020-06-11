package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class PushAndPop {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        //Add items in stack....
        stack.push("Bottom");
        printStack(stack);
        stack.push("Second");
        printStack(stack);
        stack.push("Third");
        printStack(stack);

        //Take out items from stack..
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
    }

    private static void printStack(Stack<String> A) {
        if (A.isEmpty()){
            System.out.print("You have nothing in your Stack.");
        }else {
            System.out.printf(" %s TOP\n", A);
        }
    }
}
