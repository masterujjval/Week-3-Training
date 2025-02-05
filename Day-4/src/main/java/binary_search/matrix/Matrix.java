package binary_search.matrix;

import java.util.ArrayList;

public class Matrix {

    public static boolean matrix(ArrayList<ArrayList<Integer>> list,int target){
        // when creating a 2d list we have initialise its row too
        int row=list.size();
        int col=list.getFirst().size();
        int left=0;
        int right=(row*col)-1;
        while(left<=right){
            int mid=(left+right)/2;
            int r=mid/col; // will determine the row quotient
            int c=mid%col; // will determine the col remainder

            if(list.get(r).get(c)==target){
                return true;
            }
            else if(list.get(r).get(c)<target){
                left=mid+1;
            }
            else if(list.get(r).get(c)>target){
                right=mid-1;
            }



        }



    return false;
    }



}
