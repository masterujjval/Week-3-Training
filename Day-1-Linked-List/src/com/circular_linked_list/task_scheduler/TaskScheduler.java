package com.circular_linked_list.task_scheduler;

public class TaskScheduler {
    // main node structure
    //without nested class

    protected int taskId;
    protected String task;
    protected int priority;
    protected int due;
    TaskScheduler next;
    TaskScheduler prev;


    TaskScheduler(int taskId,String task,int priority,int due){
        this.task=task;
        this.taskId=taskId;
        this.priority=priority;
        this.due=due;
        this.next=null;
        this.prev=null;
    }

}
