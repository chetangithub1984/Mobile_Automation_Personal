package test.java;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import main.java.General_Store_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class General_Store_Store_3 extends General_Store_Base {

  public static void main (String args []) throws MalformedURLException, InterruptedException {

      AndroidDriver<AndroidElement> driver =  capabilities("emulator");
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.findElement(By.id("android:id/text1")).click();
      driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"));");
      driver.findElementByAndroidUIAutomator("text(\"Aruba\")").click();
      driver.findElementByAndroidUIAutomator("text(\"Enter name here\")").sendKeys("Chetan");
      driver.findElementByAndroidUIAutomator("text(\"Let's  Shop\")").click();

      driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                      + ".resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView("
                      + "new UiSelector().text(\"Air Jordan 9 Retro\"));");

      int size = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
      for ( int i = 0; i < size ; i ++) {

          String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
          if(productName.equalsIgnoreCase("Air Jordan 9 Retro")) {
              driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
              break;
          }
      }
      driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
      Thread.sleep(2000);
      driver.findElement(By.className("android.widget.CheckBox")).click();
      WebElement Terms = driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));
      TouchAction t = new TouchAction(driver);
      t.longPress(LongPressOptions.longPressOptions().withElement(element(Terms))).perform();
      driver.findElementByAndroidUIAutomator("text(\"CLOSE\")").click();
      driver.findElementByAndroidUIAutomator("text(\"Visit to the website to complete purchase\")").click();

      Set<String> contexts = driver.getContextHandles();
      for ( String context : contexts) {
          System.out.println(context);
      }
        driver.context("WEBVIEW_com.androidsample.generalstore");
        driver.findElement(By.name("q")).sendKeys("Chetan");
      driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
      driver.pressKey(new KeyEvent(AndroidKey.BACK));

  }
}
