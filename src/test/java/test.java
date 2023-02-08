import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;

public class test {
    @Test
    public void test(){

        String a = "alex";
        String b = "alex";
        Assert.assertEquals(a,b, "Strings do not match");

        Integer c = 0;
        Integer d = 0;
        Assert.assertEquals(c,d, "Integers do not match");

        List<Integer> e = Arrays.asList(1,2,3);
        List<Integer> f = Arrays.asList(1,2,3);
        Assert.assertEquals(e,f, "Lists do not match");

    }
}
