package com.doubly_linked_list.movie_management_system;

public class Main {
    public static void main(String[] args) {
        MovieManagement movie=new MovieManagement();

        movie.addEnd("American Pie","Akshit Patel",2018,5);
        movie.addEnd("Dark","Ujjwal Gupta",2021,9);
        movie.addEnd("kick","Deepak",2012,4);
        movie.addAt("blue streak","Miles",2000,9,2);
        // adding at 2nd position
        movie.addAt("vivah","Saloni",1998,4,2);
        movie.addAt("blue streak","Miles",2000,9,3);


        //
        movie.delete("vivah");

        movie.display();
        movie.searchDirector("Miles");
        movie.searchRating(9);


    }
}
