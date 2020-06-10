package test.java;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import main.java.Base;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class SecondProgram extends Base {

    public static void main (String args [] ) throws MalformedURLException {

       AndroidDriver<AndroidElement> driver =  capabilities("emulator");
       driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

       int size = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();

        System.out.println(size);

    }
}
