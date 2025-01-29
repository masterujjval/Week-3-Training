package com.circular_linked_list.round_robin_algo;

public class Main {
    public static void main(String[] args) {
        RoundRobin p=new RoundRobin();
        p.addProcess(121,12,7);
        p.addProcess(991,9,3);
        p.addProcess(1091,15,5);
        p.addProcess(2312,21,10);
        p.addProcess(9732,13,3);


        p.startProcess();



    }
}
