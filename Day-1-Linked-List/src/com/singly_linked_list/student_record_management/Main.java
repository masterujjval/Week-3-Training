package com.singly_linked_list.student_record_management;

public class Main {
    public static void main(String[] args) {
        StudentNode stud=new StudentNode();

        stud.addStudentEnd(1234,"ujjwal",18,'S');
        stud.addStudentEnd(8931,"deppak",18,'B');
        stud.addStudentEnd(8882,"akshit",18,'A');
        stud.addStudentEnd(3728,"saloni",18,'Z');



        //adding at beggining
        stud.addStudentBegin(1282,"Zoro",21,'S');


        //searching suing seachrooll
        stud.searchRoll(8931);
// deleting by roll
        stud.delete(8931);
        stud.display();

        // adding record at speicific pos
        stud.addStudentAt(0000,"Java",100,'J',3);
        System.out.println();

        // updating grad
        stud.updateGrade(3728,'A');
        stud.display();






    }
}
