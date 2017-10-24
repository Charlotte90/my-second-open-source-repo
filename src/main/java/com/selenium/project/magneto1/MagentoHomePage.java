package com.selenium.project.magneto1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoHomePage {

    private WebDriver driver;

    public void createBrowser() {

        String chromePath = "E:\\Dev_Ops_ Charl\\My_Other_Code\\my-second-open-source-repo\\drivers\\linux\\chrome\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath );
        this.driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    public void navigatToMagentoHome() {

        driver.navigate().to("https://www.live.guru99.com/");
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getMagentoUrl() {
        return driver.getCurrentUrl();
    }

    public void closeBrowser() {
        driver.close();
    }
}
