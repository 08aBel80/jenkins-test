import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import aquality.selenium.browser.BrowserName;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class browserTest {
    @Test
    public void test(){
        System.out.println("search engine: "+ System.getenv("searchEngine"));
        System.out.println("chosen browser: " + System.getenv("browser"));
    }
}
