package com.stack.sort_stack;

import java.util.Stack;

public class Main {
    public static void main(String args[]){
        Stack<Integer>stack=new Stack<>();
        stack.push(3);
        stack.push(9);
        stack.push(1);
        stack.push(6);
        stack.push(2);

        SortStack.sortRecurse(stack);
        SortStack.display(stack);

    }
}
