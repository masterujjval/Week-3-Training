package binary_search.challenge_problem;

import java.util.Arrays;

public class SearchProblems {

    // Function to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // Mark the elements as visited using negative marking
        for (int i = 0; i < n; i++) {
            // We only care about numbers in the range [1, n]
            if (arr[i] > 0 && arr[i] <= n) {
                // Mark the element at index arr[i] - 1 as negative to indicate it's visited
                if (arr[Math.abs(arr[i]) - 1] > 0) {
                    arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
                }
            }
        }

        // Traverse the array to find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1; // The first unmarked index + 1 is the missing integer
            }
        }

        return n + 1; // If no missing number found, return n + 1
    }

    // Function to perform Binary Search and find the index of the target element
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index if target is found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Return -1 if target is not found
    }


}
