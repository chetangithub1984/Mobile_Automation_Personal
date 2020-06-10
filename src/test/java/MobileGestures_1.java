package test.java;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import main.java.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class MobileGestures_1 extends Base {

    // Touch and long Press

    public static void main (String args [] ) throws MalformedURLException {

       AndroidDriver<AndroidElement> driver =  capabilities("emulator");
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
       driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
       driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
        WebElement peopleNames = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
        TouchAction t = new TouchAction(driver);
        //t.longPress(LongPressOptions.longPressOptions().withElement(element(peopleNames))).perform();
        // OR we can use below one
        t.longPress(LongPressOptions.longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
        //t.tap(TapOptions.tapOptions().withElement(element(peopleNames))).perform();
        driver.findElementById("android:id/title").isDisplayed();




    }
}
