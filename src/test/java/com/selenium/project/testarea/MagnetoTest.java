package com.selenium.project.testarea;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagnetoTest {

    private WebDriver driver;

    @Before
    public void setUp(){

        String chromePath = "E:\\Dev_Ops_ Charl\\My_Other_Code\\my-second-open-source-repo\\drivers\\linux\\chrome\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.navigate().to("http://live.guru99.com");

    }

    @Test(timeout = 35000)
    public void testToValidateMagnetoPageTitle()
    {
        String pageTitle = driver.getTitle();
        System.out.print("pageTitle");
        Assert.assertTrue(pageTitle.equals("Home page"));
    }

    @Test
    public void testToValidateAppUrl()
    {
       String appUrl = driver.getCurrentUrl();
       System.out.print(appUrl);
       Assert.assertTrue(appUrl.contains("live.guru99.com"));

    }

    @After
    public void cleanUp()
    {
        driver.quit();

    }


}
