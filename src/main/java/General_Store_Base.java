package main.java;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class General_Store_Base {

    public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
        String apkPath = System.getProperty("user.dir") + "/General_Store.apk";
        DesiredCapabilities cap = new DesiredCapabilities();
        if (device.equalsIgnoreCase("emulator")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
        } else if (device.equalsIgnoreCase("real")) {
            // for real android device below use below one
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }
        cap.setCapability(MobileCapabilityType.APP, apkPath);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;


    }
}
