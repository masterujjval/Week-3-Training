package com.stack.queue_using_stacks;
import java.util.*;
public class StackToQueue {

    // queue -> first in first out
    // inserting elements in stack1
    Stack<Integer>s1=new Stack<>();
    Stack<Integer>s2=new Stack<>();
    // calling this method to insert elements in the stack
    public void insert(int n){
        s1.push(n);
    }
    // inserting s1 elements to s2
    private void operation(){
        while(!(s1.isEmpty())){
            int temp=s1.peek();
            s2.push(temp);
            s1.pop();
        }
    }

    public void queueTraverse(){
        operation();
        System.out.println("Implementing Queue using Stacks.....\n");

        while(!(s2.isEmpty())){
            int temp=s2.peek();
            System.out.print(temp+"<-");
            s2.pop();
        }
        System.out.println();


    }


}
