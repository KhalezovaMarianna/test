package com.qaprosoft.carina.demo.mobile;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.web.BaseTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.HomePage;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AndroidOne extends BaseTest {
    @Test
    @MethodOwner(owner = "qpsdemo")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testRateProduct() {
        HomePage homePage = new HomePage(getDriver());
        Assert.assertTrue(homePage.isPageOpened(), "HomePage isn't open");
}}
