package binary_search.find_rotation_point;

public class Main {

    public static void main(String[] args) {
        int arr[]={10,9,8,7,6,5,4,3,2,1}; //rotated sorted array

        int ans=RotationPoint.rotated(arr);
        System.out.println("Rotated index is: "+ans);
    }

}


