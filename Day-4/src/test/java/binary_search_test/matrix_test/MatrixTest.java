package binary_search_test.matrix_test;

import binary_search.matrix.Matrix;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MatrixTest {

    @Test
            public void tester() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // adding rows as to crate two d arraylist
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>()); // now arraylist have three rows

        // inserting elements in arraylist

        //inserting elements
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(count);
                count++;
            }
        }

        Assert.assertEquals(true, Matrix.matrix(list,9));
    }

}
