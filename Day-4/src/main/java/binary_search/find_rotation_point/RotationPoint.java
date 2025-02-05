package binary_search.find_rotation_point;

public class RotationPoint {

    public static int rotated(int arr[]){

        int left=0;
        int right=arr.length-1;


        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[right]){
                left=mid+1; // rotataed sorted array
                            // means smaller elements are in right side
            }
            else if(arr[mid]<arr[right]){
                right=mid; // this means smaller number are in left side
            }

        }



    return left; // returning index
    }

}
