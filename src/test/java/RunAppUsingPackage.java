import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RunAppUsingPackage {
    @Test
    public void openappusingapp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Aminephone");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.apps.photos.home.HomeActivity");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.apps.photos");

        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
    }
}
