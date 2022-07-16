package apkTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Dualingo_Scroll {


    @Test
    public void ScrollDualingo() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel3");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Mehmet\\IdeaProjects\\appiumWorkShop\\src\\test\\java\\AppiumClassFirst\\APP\\Duolingo.apk");
        desiredCapabilities.setCapability("fullreset", "true");
        // ! Yukarıdaki path i kendinize göre ayarlayınız.
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("com.duolingo:id/introFlowNewUserButton")).click();
        Thread.sleep(4000);
/*
        (new TouchAction(driver))
                .press(PointOption.point(881, 5092))
            .moveTo(PointOption.point(874, 442))
        .release()
        .perform();*/
        TouchAction touchAction = new TouchAction(driver);

        touchAction.longPress(PointOption.point(881, 1870))
                .moveTo(PointOption.point(874, 230))
                .release()
                .perform();

        Thread.sleep(4000);
        touchAction.longPress(PointOption.point(881, 1870))
                .moveTo(PointOption.point(874, 230))
                .release()
                .perform();

        Thread.sleep(4000);
        touchAction.longPress(PointOption.point(881, 1870))
                .moveTo(PointOption.point(874, 230))
                .release()
                .perform();

driver.findElement(By.xpath("\t\n" +
        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.TextView")).click();

        }}

