package binary_search.find_occurence;

public class FindOccur {

    // Function to find the first occurrence of the target element
    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid; // Potential first occurrence
                right = mid - 1; // Search in the left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    // Function to find the last occurrence of the target element
    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid; // Potential last occurrence
                left = mid + 1; // Search in the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }

    // Main function to return the first and last occurrence
    public static int[] findFirstAndLast(int[] arr, int target) {
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        return new int[]{first, last};
    }


}
