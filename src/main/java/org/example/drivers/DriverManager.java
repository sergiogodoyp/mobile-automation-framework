package org.example.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.example.utils.ConfigReader;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class DriverManager {
    protected static AppiumDriver driver;





    private static DesiredCapabilities getCapabilities(String platformName) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("automationName", ConfigReader.getProperty("automationName"));
        capabilities.setCapability("deviceName", ConfigReader.getProperty("deviceName"));
        capabilities.setCapability("udid", ConfigReader.getProperty("udid"));
        capabilities.setCapability("platformVersion", ConfigReader.getProperty("platformVersion"));
        capabilities.setCapability("noReset", Boolean.parseBoolean(ConfigReader.getProperty("noReset")));
        capabilities.setCapability("fullReset", Boolean.parseBoolean(ConfigReader.getProperty("fullReset")));

        if (platformName.equalsIgnoreCase("Android")) {
            capabilities.setCapability("appPackage", ConfigReader.getProperty("appPackage"));
            capabilities.setCapability("appActivity", ConfigReader.getProperty("appActivity"));
        } else if (platformName.equalsIgnoreCase("iOS")) {
            capabilities.setCapability("bundleId", ConfigReader.getProperty("bundleId"));
        }

        return capabilities;
    }

    public static AppiumDriver getDriver() {
        if (driver == null) {
            try {
                String platformName = ConfigReader.getProperty("platformName");
                URL appiumServerURL = new URL("http://localhost:4723");

                DesiredCapabilities capabilities = getCapabilities(platformName);

                if (platformName.equalsIgnoreCase("Android")) {
                    driver = new AndroidDriver(appiumServerURL, capabilities);
                } else if (platformName.equalsIgnoreCase("iOS")) {
                    driver = new IOSDriver(appiumServerURL, capabilities);
                }

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            } catch (Exception e) {
                throw new RuntimeException("Error inicializando el driver", e);
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}