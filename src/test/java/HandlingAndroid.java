import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sun.security.krb5.internal.TGSRep;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HandlingAndroid{

        @Test
        public void openappusingapp() throws IOException, InterruptedException {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Aminephone");
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.deskclock.DeskClock");
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.deskclock");
            AndroidDriver<AndroidElement> driver = new AndroidDriver <AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);

                // implecite wait
     //       driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
            // Explicite wait
           /* WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOf(""));
*/

            // fluent wait

       /*     Wait <AndroidDriver> wait = new FluentWait <AndroidDriver>(driver)
                    .pollingEvery(Duration.ofSeconds(3))
                    .withTimeout(Duration.ofSeconds(20))
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.invisibilityOfAllElements(());*/


            driver.findElementByXPath("//*[@text='Alarm']").click();
            driver.findElement(MobileBy.AccessibilityId("Add alarm")).click();

            AndroidElement hour4= driver.findElement(MobileBy.AccessibilityId("4"));
            AndroidElement hour10 =driver.findElement(MobileBy.AccessibilityId("10"));

            Actions Action = new Actions(driver);
            Action.clickAndHold(hour4).moveToElement(hour10).release().build().perform();

            AndroidElement minui0= driver.findElement(MobileBy.AccessibilityId("0"));
            AndroidElement minu30 =driver.findElement(MobileBy.AccessibilityId("30"));
            Thread.sleep(2000);
            Action.dragAndDrop(minu30, minui0).build().perform();
            Thread.sleep(2000);
            driver.findElementByXPath("//*[@text='OK']").click();

            Thread.sleep(3000);

            File snapshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(snapshot, new File("images/testcase2.png"));

           // driver.findElementByAccessibilityId("Cities").click();
            // driver.lockDevice();
           // Thread.sleep(2000);
           // driver.unlockDevice();
           // System.out.println(driver.isDeviceLocked());
          //  driver.rotate(ScreenOrientation.LANDSCAPE);
           // driver.findElement(MobileBy.AccessibilityId("More options")).click();
        //   driver.findElementByXPath("//*[@text='Settings']").click();

         /*   driver.findElement(MobileBy.AndroidUIAutomator
                    ("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Night mode\"))"));

            // new UiSccrollable()(new UiSelector()).scrollIntoView("")

            driver.findElementByXPath("//*[@text='Night mode']").click();*/



        }
}

