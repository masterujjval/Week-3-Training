package com.doubly_linked_list.movie_management_system;

import com.singly_linked_list.student_record_management.StudentNode;

import java.util.Objects;

public class MovieManagement {
// Doubly linked list in this address have prev and next
static class Node{
    Node prev;
    Node next;
    String movie;
    String director;
    int year;
    int rating;

    Node(String movie,String director,int year,int rating){
        this.prev=null;
        this.next=null;
        this.movie=movie;
        this.director=director;
        this.year=year;
        this.rating=rating;

    }

}
Node head=null;
Node temp=null;
Node previous=null;
    private int counter;

    public void addEnd(String movie,String director,int year,int rating){
        Node newnode=new Node(movie,director,year,rating);

        if(head==null){
            head=newnode;
            temp=newnode;
            previous=newnode;
        }
        else{
            temp.next=newnode;
            temp=newnode;
            temp.prev=previous;
            previous=temp;
        }
        counter++;

    }

    // Adding linked list at the begin
    public void addBegin(String movie,String director,int year,int rating){
        Node newnode=new Node( movie,director,year,rating);

        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        counter++;
    }

    // adding movie in specific position
    public void addAt(String movie,String director,int year,int rating,int i){
        if(i>counter){
            System.out.println("Insertion is not possible as  sufficient objects are not available");
        }
        else {
            Node newnode=new Node(movie,director,year,rating);
            Node traverse=head;
            Node pre=head;
            int t = 1;

            while (t!=i){
                pre=traverse;
                traverse=traverse.next;
                t++;
            }
            pre.next=newnode;
            newnode.next=traverse;
            traverse.prev=newnode;
            newnode.prev=pre;
        }
    }
//---------------- Delete by movie title --------------------

    public void delete(String m){

        Node t=head;
        System.out.println("\n Finding the record for "+m+"....\n");
        while(t!=null){

            if((t.movie).equals(m)){
                t.next.prev=t.prev;
                t.prev.next=t.next;
                System.out.println("\n Record deleted Successfully...\n");
                break;
            }
            t=t.next;
        }



    }

// display from both and from back

    public void display(){
        Node i=head;
        Node p=head;
        while(i!=null){
            System.out.println("Movie Name: "+i.movie+"\nMovie Director: "+i.director+"\nYear Released: "+i.year
                    +"\nMovie Rating: "+i.rating+"\n");
            p=i;
            i=i.next;

        }
        System.out.println("Traversal from backside....\n");
        while(p!=null){
            System.out.println("Movie Name: "+p.movie+"\nMovie Director: "+p.director+"\nYear Released: "+p.year
                    +"\nMovie Rating: "+p.rating+"\n");
            p=p.prev;
        }

    }
    // Search record by director or rating
    public void searchDirector(String d){
        Node i=head;
        System.out.println("\nSearching for record....\n");
        while(i!=null){
            if((i.director).equals(d)) {
                System.out.println("Record found!!!\n");
                System.out.println("Movie Name: " + i.movie + "\nMovie Director: " + i.director + "\nYear Released: " + i.year
                        + "\nMovie Rating: " + i.rating + "\n");
            break;}
            i=i.next;

        }
    }
    // search by rating

    public void searchRating(int r){
        Node i=head;
        System.out.println("\nSearching for record....\n");
        while(i!=null){
            if(i.rating==r) {
                System.out.println("Record found!!!\n");
                System.out.println("Movie Name: " + i.movie + "\nMovie Director: " + i.director + "\nYear Released: " + i.year
                        + "\nMovie Rating: " + i.rating + "\n");
                }
            i=i.next;

        }
    }




}



