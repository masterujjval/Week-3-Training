package binary_search.peak_element;
import java.lang.reflect.Array;
import java.util.*;
import java.util.HashMap;

public class PeakPiece {


    public static ArrayList<Integer> peak(int arr[]){
        ArrayList<Integer> list=new ArrayList<>();

        int left=0;
        int right= arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                list.add(arr[mid]);
                arr[mid]=0;
            }
            else if(arr[mid]<arr[mid+1]){
                // search the right part
                left=mid+1;
            }
            else if(arr[mid]<arr[mid-1]){
                right=mid-1;
            }

        }
        return list;
    }

}
