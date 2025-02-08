package comparision_of_data_structures;

public class ArrayTime {

    public static long arraycompare(int arr[],int target){

        long s=System.nanoTime();

        for (int j : arr) {
            if (j == target) break;
        }
        long e=System.nanoTime();
        System.out.println("The time taken by array(O(n)): "+(e-s));


return e-s;
    }

}
