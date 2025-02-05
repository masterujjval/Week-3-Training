package binary_search.find_occurence;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7, 8, 8, 10};
        int target = 4;

        int[] result = FindOccur.findFirstAndLast(arr, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}
