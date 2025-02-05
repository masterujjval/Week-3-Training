package binary_search_test.peak_element;

import binary_search.peak_element.PeakPiece;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PeakPieceTest {


    int arr[] = {2, 3, 1, 4, 5, 6, 3, 7, 4,1,9,8};
    @Test
    public void tester(){
        ArrayList<Integer>s=new ArrayList<>();
        s.add(6);
        Assert.assertEquals(s, PeakPiece.peak(arr));
    }

}
