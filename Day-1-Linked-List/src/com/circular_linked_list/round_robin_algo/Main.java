package com.circular_linked_list.round_robin_algo;

public class Main {
    public static void main(String[] args) {
        RoundRobin p=new RoundRobin();
        p.addProcess(121,3,7);
        p.addProcess(991,3,3);
        p.addProcess(1091,12,5);
        p.addProcess(2312,13,10);

        p.startProcess();



    }
}
