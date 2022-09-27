package com.qaprosoft.carina.demo.gui.webPages.desktop;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.webPages.common.AboutUsPageBase;
import com.qaprosoft.carina.demo.gui.webPages.common.HomePageBase;
import com.qaprosoft.carina.demo.gui.webPages.common.componentsBase.FooterBase;
import com.qaprosoft.carina.demo.gui.webPages.common.componentsBase.HeaderBase;
import com.qaprosoft.carina.demo.gui.webPages.desktop.components.Footer;
import com.qaprosoft.carina.demo.gui.webPages.desktop.components.Header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AboutUsPageBase.class)

public class AboutUsPage extends AboutUsPageBase {

    @FindBy(xpath = "//*[@id=\"navbarExample\"]")
    private Header header;

    @FindBy(xpath = "//*[@id=\"footc\"]")
    private Footer footer;

    @FindBy(xpath = "//*[@id=\"videoModalLabel\"]")
    ExtendedWebElement aboutUsPage;

    @FindBy(xpath = "//*[@id=\"videoModal\"]/div/div/div/button")
    ExtendedWebElement closeBtn;

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public boolean isOpened() {
        return aboutUsPage.isElementPresent();
    }

    @Override
    public HeaderBase getHeader() {
        return header;
    }

    @Override
    public FooterBase getFooter() {
        return footer;
    }

    @Override
    public HomePageBase clickCloseButton() {
        closeBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }
}
