package linear_search.negative_number_test;

import linear_search.negative_number.NegativeNumber;
import org.junit.Assert;
import org.junit.Test;

public class NegativeNumberTest {
    @Test
    public void tester(){
        int arr[]={2,3,4,5,188,9,-6,4,2};
        Assert.assertEquals(6, NegativeNumber.checker(arr));
    }
}
