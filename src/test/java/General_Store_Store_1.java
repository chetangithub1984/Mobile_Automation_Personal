package test.java;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import main.java.General_Store_Base;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class General_Store_Store_1 extends General_Store_Base {

  public static void main (String args []) throws MalformedURLException {

      AndroidDriver<AndroidElement> driver =  capabilities("emulator");
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.findElement(By.id("android:id/text1")).click();
      driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));");
      driver.findElementByAndroidUIAutomator("text(\"India\")").click();
      driver.findElementByAndroidUIAutomator("text(\"Enter name here\")").sendKeys("Chetan");
      driver.findElementByAndroidUIAutomator("text(\"Let's  Shop\")").click();

  }
}
