package com.circular_linked_list.task_scheduler;

public class TaskHandler {
    private int counter;
    // creating node here and some methods
    TaskScheduler head=null;
    TaskScheduler temp=null;

    public void addTaskEnd(int taskId,String task,int priority,int due){
       TaskScheduler newnode= new TaskScheduler(taskId,task,priority,due);
       counter++;
       if(head==null){
           head=newnode;
           temp=newnode;
       }
       else{
           temp.next=newnode;
           temp.next.prev=temp;
           temp=newnode;
           temp.next=head;
       }

    }
    // adding node at the beginning
    public void addTaskBegin(int taskId,String task,int priority,int due){
        TaskScheduler newnode= new TaskScheduler(taskId,task,priority,due);
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        temp.next=newnode;
        counter++;
    }

    // at specific position
    public void addTaskAt(int taskId,String task,int priority,int due,int i){
        TaskScheduler newnode= new TaskScheduler(taskId,task,priority,due);
        TaskScheduler traverse=head.next;
        if(i>counter){
            System.out.println("Insertion is not possible as  sufficient objects are not available");
        }else {
            int t=2;
            while (t!=i) {
                traverse = traverse.next;
                t++;
            }
            newnode.next=traverse;
            newnode.prev=traverse.prev;
            traverse.prev.next=newnode;
            traverse.prev=newnode;
        }
    }

    // Show method of the node
    public void showAll(){
        TaskScheduler i=head;
        int t=1;
        //System.out.println("Task ID: "+i.taskId+"\nTask: "+ i.task+"\nPriority: "+i.priority+"\nDue Date: "+i.due+"\n");
        //i=i.next;
        System.out.println("\nPrinting 2X the size of linked to demonstrate the doubly circular linked list\n");
        while(t<=(counter*2)){
            System.out.println("Task ID: "+i.taskId+"\nTask: "+ i.task+"\nPriority: "+i.priority+"\nDue Date: "+i.due+"\n");
        i=i.next;
        t++;
        }
    }

    //show current
    public void showCurrent(){
        System.out.println("\n Current Task \n");
        System.out.println("Task ID: "+temp.taskId+"\nTask: "+ temp.task+"\nPriority: "+temp.priority+"\nDue Date: "+temp.due+"\n");

        System.out.println("\n Next Task \n");
        System.out.println("Task ID: "+temp.next.taskId+"\nTask: "+ temp.next.task+"\nPriority: "+temp.next.priority+"\nDue Date: "+temp.next.due+"\n");

    }


    // remove task by id
    public void remover(int id){

        if(id==head.taskId){
            head=head.next;
            temp.next=head;
            head.prev=null;

        }
        else{
            int i=2;
            System.out.println("Searching for the record...\n");
            TaskScheduler t=head.next;
            while(i<=counter){
                if(t.taskId==id){
                    t.prev.next=t.next;
                    t.next.prev=t.prev;
                    System.out.println("Record deleted....\n");
                    break;
                }
                i++;
                t=t.next;
            }


        }




    }

public void searchPriority(int p){
    TaskScheduler i=head;
    int t=1;
    //System.out.println("Task ID: "+i.taskId+"\nTask: "+ i.task+"\nPriority: "+i.priority+"\nDue Date: "+i.due+"\n");
    //i=i.next;
    System.out.println("\nSearching task with priority "+p+"\n");
    while(t<=counter){
        if(i.priority==p) {
            System.out.println("Task ID: " + i.taskId + "\nTask: " + i.task + "\nPriority: " + i.priority + "\nDue Date: " + i.due + "\n");
        }i=i.next;
        t++;
    }
}



}
