
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class loginTest {
    @Test
    public void checkEmptyEmail() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("app", "/Users/likas/Downloads/Android-NativeDemoApp-0.2.1.apk");

        MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        MobileElement menuLoginButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup/android.widget.TextView");
        menuLoginButton.click();
        Thread.sleep(4000);
        MobileElement passwordInput = (MobileElement) driver.findElementByAccessibilityId("input-password");
        passwordInput.sendKeys("PASSWORD");
        Thread.sleep(2000);
        MobileElement loginButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup/android.widget.TextView");
        loginButton.click();
        Thread.sleep(2000);
        MobileElement errorEmailMessage = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");

        Assert.assertEquals(errorEmailMessage.getText(),
                "Please enter a valid email address");

        driver.quit();
    }

}
