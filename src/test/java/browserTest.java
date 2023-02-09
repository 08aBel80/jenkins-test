import aquality.selenium.core.logging.Logger;
import org.testng.annotations.Test;

public class browserTest {
    @Test
    public void test(){

        Logger.getInstance().info("Browser: "+ System.getenv("browser"));
        Logger.getInstance().info("Browser: "+ System.getenv("search engine: "+System.getenv("searchEngine")));

    }
}
