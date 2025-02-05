package file_reader_test.challenge_problem_test;

import input_stream_reader.challenge_probelm.PerformanceComparison;
import org.junit.Assert;
import org.junit.Test;
import java.util.concurrent.atomic.AtomicLong;
public class PerformanceComparisonTest {

    static AtomicLong sbt = new AtomicLong(0);
    static AtomicLong sbft = new AtomicLong(0);

    @Test
        public void tester(){
            PerformanceComparison.compareStringConcatenation(sbt,sbft);
            System.out.println(sbt);
        Assert.assertTrue(sbt.get()<sbft.get());
    }

}
