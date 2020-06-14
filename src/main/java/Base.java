package main.java;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;

public class Base {

public static AppiumDriverLocalService service;

    public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
        String apkPath = System.getProperty("user.dir") + "/original.apk";
        DesiredCapabilities cap = new DesiredCapabilities();
        if (device.equalsIgnoreCase("emulator")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
        } else if (device.equalsIgnoreCase("real")) {
            // for real android device below use below one
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }
        cap.setCapability(MobileCapabilityType.APP, apkPath);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;


    }

    public AppiumDriverLocalService startServer()
    {
        //
        boolean flag=	checkIfServerIsRunnning(4723);
        if(!flag)
        {

            service=AppiumDriverLocalService.buildDefaultService();
            service.start();
        }
        return service;

    }



    public static boolean checkIfServerIsRunnning(int port) {

        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);

            serverSocket.close();
        } catch (IOException e) {
            //If control comes here, then it means that the port is in use
            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }

}
