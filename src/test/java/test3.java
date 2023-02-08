import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class test3 {
    @Test
    public void test(){

        List<Integer> e = Arrays.asList(1,2,3);
        List<Integer> f = Arrays.asList(1,2,3);
        Assert.assertEquals(e,f, "Lists do not match");
    }

}
