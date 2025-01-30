package com.stack.sort_stack;
import java.util.*;
public class SortStack {

    static Stack<Integer> stack = new Stack<>();


    public void add(int n) {
        stack.push(n);
    }

    public static void display(Stack<Integer>stack){
        while(!(stack.isEmpty())){
            int t=stack.peek();
            System.out.println(t);
            stack.pop();
        }
    }


    public static void sortRecurse(Stack<Integer>stack) {
        if (!stack.isEmpty()) {
            // Step 1: Pop the top element
            int top = stack.pop();

            // Step 2: Recursively sort the remaining stack
            sortRecurse(stack);

            // Step 3: Insert the popped element at the correct position
            sortStack(stack, top);
        }
    }

    public static void sortStack(Stack<Integer>s,int top){

        if(s.isEmpty()||s.peek()<=top){
            s.push(top);
            return;
        }
            int t=s.pop();
        sortStack(s,top);

        s.push(t);

    }




}
