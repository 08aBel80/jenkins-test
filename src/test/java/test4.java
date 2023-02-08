import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class test4 {
    @Test
    public void test(){

        List<String> e = Arrays.asList("a","b","c");
        List<String> f = Arrays.asList("a","b","c");
        Assert.assertEquals(e,f, "Lists do not match");
    }

}
