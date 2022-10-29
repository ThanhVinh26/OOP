package src;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AppTest {
    public static void main(String[] args) throws InterruptedException {
        AppiumDriver<MobileElement> driver=null;
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("automationName","uiautomator2");
        desiredCapabilities.setCapability("udid","R38NB02HMSB");
        desiredCapabilities.setCapability("appPackage","com.wdiodemoapp");
        desiredCapabilities.setCapability("appActivity","com.wdiodemoapp.MainActivity");
        URL appimSerrver=null;
        try {
            appimSerrver=new URL("http://localhost:4723/wd/hub");
        }catch (Exception e)
        {
            e.printStackTrace();

        }
        if (appimSerrver==null)
        {
            throw new RuntimeException("uRRL");

        }
        driver=new AndroidDriver<>(appimSerrver,desiredCapabilities);
        Thread.sleep(10000);



    }
}
