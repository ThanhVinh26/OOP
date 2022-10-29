package src.api;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import src.driver.DriverF;
import src.driver.Platform;

public class LoginForm {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver= DriverF.getDriver(Platform.ANDROID);

        try {
           MobileElement navloginBtn= appiumDriver.findElement(MobileBy.AccessibilityId("Login"));
           navloginBtn.click();
           //tìm element
           MobileElement emailinput=appiumDriver.findElement(MobileBy.AccessibilityId("input-email"));
            MobileElement passinput=appiumDriver.findElement(MobileBy.AccessibilityId("input-password"));
            MobileElement loginbtn=appiumDriver.findElement(MobileBy.AccessibilityId("button-LOGIN"));
            //input
            emailinput.sendKeys("teo@sth.com");
            passinput.sendKeys("12345678");
            loginbtn.click();
            //verify
            WebDriverWait wait=new WebDriverWait(appiumDriver,10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("android:id/alertTitle")));
            MobileElement loginDialog=appiumDriver.findElement(MobileBy.id("android:id/alertTitle"));
            System.out.println("Dialog title: "+loginDialog.getText());
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        appiumDriver.quit();

    }
}
