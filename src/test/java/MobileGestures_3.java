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

public class MobileGestures_3 extends Base {

    // scrolling

    public static void main (String args [] ) throws MalformedURLException {

       AndroidDriver<AndroidElement> driver =  capabilities("emulator");
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");




    }
}
