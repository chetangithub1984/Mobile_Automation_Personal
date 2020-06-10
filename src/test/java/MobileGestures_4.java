package test.java;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import main.java.Base;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class MobileGestures_4 extends Base {

    // drag and drop

    public static void main (String args [] ) throws MalformedURLException {

       AndroidDriver<AndroidElement> driver =  capabilities("emulator");
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
       driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
        WebElement source = driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
        TouchAction t = new TouchAction(driver);
        t.longPress(LongPressOptions.longPressOptions().withElement(element(source)))
                .moveTo(element(destination)).release().perform();

        driver.pressKey(new KeyEvent(AndroidKey.BACK));





    }
}
