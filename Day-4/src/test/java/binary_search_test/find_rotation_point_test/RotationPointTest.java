package binary_search_test.find_rotation_point_test;

import binary_search.find_rotation_point.RotationPoint;
import org.junit.Assert;
import org.junit.Test;

public class RotationPointTest {
    int arr[]={10,9,8,7,6,5,4,3,2,1}; //rotated sorted array

    @Test
    public void tester(){
        Assert.assertEquals(9, RotationPoint.rotated(arr));
    }


}
