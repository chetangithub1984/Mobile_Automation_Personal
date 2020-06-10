package test.java;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import main.java.General_Store_Base;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class General_Store_Toast_Msg extends General_Store_Base {

  public static void main (String args []) throws MalformedURLException {

      AndroidDriver<AndroidElement> driver =  capabilities("emulator");
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.findElementByAndroidUIAutomator("text(\"Let's  Shop\")").click();

      String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
      System.out.println(toastMessage);


  }
}
