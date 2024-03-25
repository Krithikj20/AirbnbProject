package org.PageObjects;

import org.Utils.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BookingpageObjects extends Actions {
    public WebDriver driver;

    public BookingpageObjects(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@data-testid='card-container'])[1]")
    private WebElement FirstImage;
    @FindBy(xpath = "(//span[@class='tmel3e0 atm_9s_1ulexfb atm_vy_1osqo2v atm_e2_1osqo2v atm_jb_uuw12j atm_2w_1egmwxu atm_k4_idpfg4 atm_uc_kn5pbq atm_2g_ux2fpz atm_k4_kb7nvz_1nos8r atm_uc_yz1f4_csw3t1 atm_k4_idpfg4_csw3t1 atm_tr_kftzq4_csw3t1 atm_2g_glywfm_1o5j5ji atm_2g_18db1bz__1vlbm2j dir dir-ltr'])[2]")
    private WebElement ReserveButton;

    public void Booking() {
        FirstImage.click();
        Actions tab=new Actions(driver);
        tab.NewTab();
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView();", ReserveButton);
                ReserveButton.click();
            }

        }

