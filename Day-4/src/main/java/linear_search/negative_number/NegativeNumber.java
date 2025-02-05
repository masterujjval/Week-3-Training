package linear_search.negative_number;

public class NegativeNumber {

    public static int checker(int arr[]){
        for(int i=0;i<arr.length;i++){
           if(arr[i]<0){
               return i;
           }
        }
        return -1;
    }


}
