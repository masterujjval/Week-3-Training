package com.singly_linked_list.student_record_management;

public class StudentNode {


    static class Node{
         int roll;
         String name;
         int age;
         char grade;
         Node next;

         Node(int roll,String name,int age,char grade){
             this.roll=roll;
             this.name=name;
             this.age=age;
             this.grade=grade;
             this.next=null;
         }

    }

    public Node head=null;
    public Node temp=null;
    private int counter;
    // setter for singly list

    public void addStudentEnd(int roll,String name,int age,char grade){
        Node newnode=new Node( roll, name, age, grade);

        if(head==null){
            head=newnode;
            temp=newnode;
        }
        else{
            temp.next=newnode;
            temp=newnode;
        }
        counter++;

    }

    // add student in the beggining
    public void addStudentBegin(int roll,String name,int age,char grade){
        Node newnode=new Node( roll, name, age, grade);

      newnode.next=head;
      head=newnode;
    counter++;
    }
// at specific position

    public void addStudentAt(int roll,String name,int age,char grade,int i){
        if(i>counter){
            System.out.println("Insertion is not possible as  sufficient objects are not available");
        }
        else {
            Node newnode=new Node(roll,name,age,grade);
            Node traverse=head;
            Node prev=head;
            int t = 1;

            while (t!=i){
                prev=traverse;
                traverse=traverse.next;
                t++;
            }
            prev.next=newnode;
            newnode.next=traverse;
        }
    }

// Delete a record rollnumber

    public void delete(int r){
        System.out.println("Deleting the record.......");
        Node prev=head;
        Node traverse=head;
        while(traverse!=null){
            if(traverse.roll==r){
                if(traverse==head){
                    head=head.next;
                    System.out.println("Record Deleted Successfully!! \n");
                break;
                }
                else{
                    prev.next=traverse.next;
                    System.out.println("Record Deleted Successfully!! \n");
                    break;
                }
            }
            prev=traverse;
            traverse=traverse.next;
        }
        if(traverse==null){
            System.out.println("No record of that Roll Number found!");
        }
    }
 // update grade baesd on the roll

    public void updateGrade(int r,char g){
        Node t=head;
        while(t!=null){
            if(t.roll==r){
                System.out.println("\nGrade updated successfully!!\n");
                t.grade=g;
                break;
            }

            t=t.next;
        }
        if(t==null) System.out.println("No record found to upgrade");
    }




    public void display(){
         Node i=head;
         while(i!=null){
             System.out.println("Student Name: "+i.name+"\nStudent Roll Number: "+i.roll+"\nStudent Age: "+i.age
             +"\nStudent Grade: "+i.grade+"\n");
             i=i.next;

         }

    }

    // search using roll numbers
    public void searchRoll(int r){
        Node i=head;
        System.out.println("Searching for record "+r+" .......");
        while(i!=null){
            if(i.roll==r) {
                System.out.println("Record Found!!!");
                System.out.println("Student Name: " + i.name + "\nStudent Roll Number: " + i.roll + "\nStudent Age: " + i.age
                        + "\nStudent Grade: " + i.grade + "\n");
                break;
            }
            i=i.next;

        }
        if(i==null) System.out.println("No record Found!!");

    }






}
