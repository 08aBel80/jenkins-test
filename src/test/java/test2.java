import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {
    @Test
    public void test(){

        Integer c = 0;
        Integer d = 0;
        Assert.assertEquals(c,d, "Integers do not match");
    }

}
