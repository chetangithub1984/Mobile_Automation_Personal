package test.java;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import main.java.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstProgram extends Base {

    public static void main (String args [] ) throws MalformedURLException {

       AndroidDriver<AndroidElement> driver =  capabilities("emulator");
       driver.findElement(By.xpath("//*[@text='Preference']")).click();
       driver.findElement(By.xpath("//*[@text='3. Preference dependencies']")).click();
       driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();
        driver.findElementById("android:id/edit").sendKeys("chetan");
        driver.findElement(By.xpath("//*[@text='OK']")).click();



    }
}
