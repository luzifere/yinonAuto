package Tests;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class Untitled {
	private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected static AppiumDriver driver;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "8A4DD8ED-BF2F-4113-A830-881F6AB74412");
        //dc.setCapability(MobileCapabilityType.UDID, "b5b85aa834a29d1e90a5a0e1400c955235431104");
      //  dc.setCapability(MobileCapabilityType.APP, "/Users/yinonwishi/appiumstudio/original-apks/Wishi.ipa");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.Wishi.Wishi");
        dc.setCapability(MobileCapabilityType.NO_RESET,true);
        driver = new AppiumDriver <WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

   
}
