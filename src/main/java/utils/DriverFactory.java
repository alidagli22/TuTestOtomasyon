package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverFactory {
    public static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();


    public static void initializeDriver() {
        WebDriverManager.chromedriver().clearDriverCache();
        WebDriverManager.chromedriver().clearResolutionCache();
        WebDriverManager.chromedriver().setup();
        driverThreadLocal.set(new ChromeDriver());
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
    }

    public static synchronized WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    public static synchronized void quitDriver() {
        driverThreadLocal.get().quit();
        driverThreadLocal.remove();
    }
}
