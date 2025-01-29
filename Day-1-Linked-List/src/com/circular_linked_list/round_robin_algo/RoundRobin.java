package com.circular_linked_list.round_robin_algo;

public class RoundRobin {
    public static int counter=0;

    private int tq=3;


    static class Node{
        private int processId;
        private int burstTime;
        private int priority;
        private Node next;
        Node(int processId,int burstTime,int priority) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.priority = priority;
            this.next = null;
            counter++;

        }
    }
    Node head=null;
    Node temp=null;

    // Methods for implementing Round Robin

    public void addProcess(int processId,int burstTime,int priority){
        Node newnode=new Node(processId,burstTime,priority);

        if(head==null){
            head=newnode;
            temp=newnode;

        }
        else{
            temp.next=newnode;
            temp=newnode;
            temp.next=head;
        }

    }
    int time=0;

public void startProcess(){
        Node tail=head;
        Node prev=temp;  // temp is tail
        Node tester=prev;
        int t=counter;
    System.out.println("\nTime Quantum is: "+tq);
    System.out.println("\nStarting the process execution....\n");
        // turn around time


        while(counter!=0){
            time+=(tail.burstTime)-tq;
            tail.burstTime= (tail.burstTime)-tq;

            if(counter==1){
                tail.next=tail;
            }

            if(tail.burstTime<=0){
                 // true for temp too as the last tail will get plunge in
                    System.out.println("\nDeleting the process: " + tail.processId);
                    counter--;
                    prev.next = tail.next;

                    tester=null;
            }
            else {
                System.out.println("\nProcess Id: " + tail.processId + "\nBurst Time: " +tail.burstTime+"\nPriority: " + tail.priority);
            }
            if(tester!=null){
                prev=tail;
            }
            tester=tail;
            tail=tail.next;


        }
    System.out.println("\nAll processes are executed..........");
    System.out.println("\nTotal Time Taken by process: "+time);
    System.out.println("\nAverage time taken by process: "+(time/t));


}


}











