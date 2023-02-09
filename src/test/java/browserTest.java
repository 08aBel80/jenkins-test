import aquality.selenium.browser.AqualityServices;
import org.testng.annotations.Test;
import utils.settingsUtils;

public class browserTest {
    @Test
    public void test(){
        String browserName = System.getenv("browser");
        String url = System.getenv("searchEngine");

        settingsUtils.setBrowserName(browserName);

        AqualityServices.getBrowser().goTo(url);
    }
}
