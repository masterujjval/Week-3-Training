package recursive_vs_iterative;

import org.junit.Assert;
import org.junit.Test;

public class RecursionIterationTest {

    @Test
    public void tester(){
        Assert.assertTrue(IterativeTime.iterativeTime(30)<RecursionTime.recursionTime(30));
    }


}
