package challenge_problems;

import binary_search.challenge_problem.SearchProblems;
import org.junit.Assert;
import org.junit.Test;

public class SearchProblemsTest {
    int[] arr1 = {3, 4, -1, 1};
    int[] arr2 = {1, 3, 5, 7, 9};
    int target = 5;

    @Test
    public void tester() {



        // Find first missing positive integer
        Assert.assertEquals(1, SearchProblems.findFirstMissingPositive(arr1));
        Assert.assertEquals(2,SearchProblems.binarySearch(arr2, target));

    }
}