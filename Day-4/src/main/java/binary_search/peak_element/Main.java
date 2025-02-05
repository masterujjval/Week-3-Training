package binary_search.peak_element;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        int arr[] = {2, 3, 1, 4, 5, 6, 3, 7, 4,1,9,8};
        ArrayList<Integer> list = PeakPiece.peak(arr); // cant possible to return one so anyone we have to return

        System.out.println(list);

    }
}
