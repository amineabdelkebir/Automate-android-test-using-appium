import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class RunAndmanageClockApp {

    @Test
    public void openappusingapp() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Aminephone");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.deskclock.DeskClock");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.deskclock");


        AndroidDriver   <AndroidElement> driver = new AndroidDriver <AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
       /* driver.findElementByAccessibilityId("Cities").click();
        Thread.sleep(2000);
        driver.findElementById("com.google.android.deskclock:id/search_src_text").sendKeys("paris");
        Thread.sleep(2000);
        driver.findElementById("com.google.android.deskclock:id/search_src_text").clear();
        String text= driver.findElementById("com.google.android.deskclock:id/search_src_text").getText();
        System.out.println(text);
        String text1= driver.findElementById("com.google.android.deskclock:id/search_src_text").getAttribute("class");
        System.out.println(text1);*/
       /* AndroidElement Stopwatch = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Stopwatch\")"));
        Stopwatch.click();*/
        System.out.println(driver.findElementById("com.google.android.deskclock:id/fab").getLocation());
        System.out.println(driver.findElementById("com.google.android.deskclock:id/fab").getSize());

        driver.quit();

       //driver.findElement(By.id("com.google.android.deskclock:id/fab")).click();
         //driver.findElement(MobileBy.id("com.google.android.deskclock:id/fab")).click();
        //driver.findElementById("com.google.android.deskclock:id/fab").click();
       // driver.findElementByAccessibilityId("Timer").click(); // content-desc
        //Thread.sleep(5000);
        //driver.findElement(By.id("com.google.android.deskclock:id/search_src_text")).sendKeys("tunis");
        //driver.findElementByXPath("//android.widget.TextView[@text='Stopwatch']").click();
        // we can change the class name "android.widget.TextView" by "*"
      //  driver.findElementByXPath("(//android.widget.TextView)[2]").click();
       // driver.findElement(MobileBy.AndroidUIAutomator("text(\"Stopwatch\")")).click();
        //driver.findElement(MobileBy.AndroidUIAutomator("description(\"More options\")")).click();
       // driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().checked(\"false\")")).click();
       /* List <AndroidElement> menu = driver.findElementsByClassName("ck");
        menu.get(3).click();*/


    }
}
