package setup;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
    public AndroidDriver driver;

    public static final String PACKAGE_ID="com.google.android.calculator";

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName","MyDevice");
        caps.setCapability("platformName","Android");
        caps.setCapability("uuid","emulator-5554");
        caps.setCapability("appPackage","com.google.android.calculator");
        caps.setCapability("appActivity","com.android.calculator2.Calculator");
        caps.setCapability("app",System.getProperty("user.dir"+"/src/test/resources/calculator.apk"));
        caps.setCapability("autoGrantPermissions",true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver<>(url,caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    public static void main(String[] args) {
        String dir =System.getProperty("user.dir");
        System.out.println(dir);
    }

}
