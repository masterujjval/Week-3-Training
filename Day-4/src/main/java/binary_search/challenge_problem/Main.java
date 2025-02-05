package binary_search.challenge_problem;

public class Main{
public static void main(String[] args) {
    // Example array for Linear Search
    int[] arr1 = {3, 4, -1, 1};

    // Find first missing positive integer
    int firstMissingPositive = SearchProblems.findFirstMissingPositive(arr1);
    System.out.println("First Missing Positive Integer: " + firstMissingPositive);

    // Example array for Binary Search
    int[] arr2 = {1, 3, 5, 7, 9};
    int target = 5;

    // Perform Binary Search for the target
    int targetIndex = SearchProblems.binarySearch(arr2, target);
    System.out.println("Index of " + target + ": " + targetIndex);
}
}