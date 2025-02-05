package stringbuffer_test.compare_string_builder_test;

import org.junit.Assert;
import org.junit.Test;
import stringbuffer.concate_string.ConcateString;

public class ConcateString_Test {
    @Test
    public void concate_test(){
        ConcateString obj=new ConcateString();
        String arr[]={"Ujjwal", " Gupta"," Capge"};
        Assert.assertEquals("Ujjwal Gupta Capge",obj.concate(arr).toString());
    }

}
