package binary_search_test.find_occurence_test;
import binary_search.find_occurence.FindOccur;
import org.junit.Assert;
import org.junit.Test;

public class FindOccurTest {
    @Test
    public void tester(){
        int[] arr = {2, 4, 4, 4, 6, 7, 8, 8, 10};
        int ans[]={1,3};
        Assert.assertArrayEquals(ans, FindOccur.findFirstAndLast(arr, 4));


    }


}
