package com.unitedcoder.SingletonDesign;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static com.google.common.util.concurrent.Futures.scheduleAsync;
import static com.google.common.util.concurrent.Futures.withTimeout;

public class TestBase {
    public static WebDriver driver;
public static void BrowserSetUp() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options=new ChromeOptions();
    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    driver=new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php?");

            }
            public static void closeBroser() {
        driver.quit();
       // driver = null;
       // driver.close();
    }

    //stataic wait
    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //implcit wait
    public static void impliciWait(int second) {

        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }
    //explicit wait
    public  static  void  waitForElementPresent(WebElement element, int timeOut){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    //fluen wait

    public static void fluentWait(WebElement element){
            Wait<WebDriver> wait=new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.visibilityOf(element));



    }   }











