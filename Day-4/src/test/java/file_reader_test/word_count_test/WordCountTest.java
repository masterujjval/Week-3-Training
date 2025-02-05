package file_reader_test.word_count_test;

import file_reader.word_count.WordCount;
import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {

    @Test
    public void Test(){
        Assert.assertEquals(2,WordCount.wordcount());
    }
}
