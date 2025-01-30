package com.queue.circular_tour_problem;

public class Main {
    public static void main(String[] args) {
        CircularTour c=new CircularTour();
        int[][] pumps = {
                {4, 6},  // Pump 0: Petrol = 4, Distance = 6
                {6, 5},  // Pump 1: Petrol = 6, Distance = 5
                {7, 3},  // Pump 2: Petrol = 7, Distance = 3
                {4, 5}   // Pump 3: Petrol = 4, Distance = 5
        };

        int result = c.result(pumps);
        if (result == -1) {
            System.out.println("Circular tour is not possible.");
        } else {
            System.out.println("Start at Petrol Pump: " + result);
        }

    }
}