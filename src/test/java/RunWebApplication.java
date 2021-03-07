import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class RunWebApplication {
    @Test
    public void openWebApplication() throws MalformedURLException {
        DesiredCapabilities caps =new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Aminephone");

        /*caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        caps.setCapability(AndroidMobileCapabilityType.BROWSER_NAME,"chrome");
        caps.setCapability(AndroidMobileCapabilityType.BROWSER_VERSION,"83.0.4103.106");
         WebDriverManager.chromedriver().setup();
        caps.setCapability("chromedriverExecutable", WebDriverManager.chromedriver().getBinaryPath());
*/

        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.chrome");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.apps.chrome.Main");


        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        driver.get("http://www.google.com");



    }
}
