package test.java;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import main.java.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class MobileGestures_2 extends Base {

    // swipe operations

    public static void main (String args [] ) throws MalformedURLException {

       AndroidDriver<AndroidElement> driver =  capabilities("emulator");
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
       driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
       driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
       //driver.findElementByAndroidUIAutomator("new UiSelector().content-desc(9)").click();
        driver.findElement(By.xpath(".//*[@content-desc='9']")).click();
        WebElement first = driver.findElement(By.xpath(".//*[@content-desc='15']"));
        WebElement second = driver.findElement(By.xpath(".//*[@content-desc='45']"));
        TouchAction t = new TouchAction(driver);
       // t.longPress(LongPressOptions.longPressOptions().withElement(element(first))
        //        .withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
        t.longPress(LongPressOptions.longPressOptions().withElement(element(first))).moveTo(element(second)).release().perform();





    }
}
