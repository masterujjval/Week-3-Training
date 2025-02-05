package linear_search.search_word_test;

import linear_search.search_word.SearchWord;
import org.junit.Assert;
import org.junit.Test;

public class SearchWordTest {
    String arr[]={"the black fox","in the forest found","something is ","shining in the deep dark forest"};

    @Test
    public void tester(){
        Assert.assertEquals("the black fox", SearchWord.search(arr,"fox"));
    }

}
