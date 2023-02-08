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


    }
}
