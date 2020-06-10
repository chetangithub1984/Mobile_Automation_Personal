package test.java;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import main.java.Web_Base;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Web_app_Test extends Web_Base {

    public static void main (String args [] ) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver =  capabilities("emulator");
        driver.get("http://facebook.com");
        driver.findElement(By.xpath("//*[@id=\"m_login_email\"]")).sendKeys("pat");

    }
}
