package com.selenium.project.testarea;

import com.selenium.project.magneto1.MagentoHomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MagentoHomePageTest {

    private MagentoHomePage magentoHomePage;

    @Before
    public void goToMagentoHomePage()
    {
        this.magentoHomePage = new MagentoHomePage();
        magentoHomePage.createBrowser();
        magentoHomePage.navigatToMagentoHome();

    }


    @Test
    public void getMagentoPageTitle()
    {
        String pageTitle = magentoHomePage.getTitle();
        Assert.assertTrue(pageTitle.equals("Home page"));
    }

    @Test(timeout = 35000)
    public void navigateToMagentoUrl()
    {
        String appUrl = magentoHomePage.getMagentoUrl();
//        Assert.assertTrue(appUrl.contains("https://www.live.guru99.com/"));

    }

    @After
    public void cleanUpTest()
    {
        magentoHomePage.closeBrowser();
    }

}
