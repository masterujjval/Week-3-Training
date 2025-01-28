package com.circular_linked_list.task_scheduler;

public class Main {

    public static void main(String[] args) {
        TaskHandler t=new TaskHandler();
        // priority out of 5
        //30-01-2003 -> 30012003
        t.addTaskEnd(1,"Start daemon",4,30012003);
        t.addTaskEnd(2,"Start Jenkins",5,30012003);
        t.addTaskEnd(3,"Start Trigger",5,30012003);

       t.addTaskBegin(0,"Start the system",2,30012003);

        t.showCurrent();

        t.remover(3);
        t.showAll();
        t.addTaskEnd(4,"Log File",5,30012003);
        t.addTaskEnd(5,"Backup",5,30012003);
        t.searchPriority(5);

    }


}
