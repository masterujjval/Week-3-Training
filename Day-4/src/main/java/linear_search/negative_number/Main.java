package linear_search.negative_number;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,4,5,5,2,5,-3,-6,1};
        int t= NegativeNumber.checker(arr);
        System.out.println("Negative at index: "+t);
    }
}
