package org.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchpageObjects {
  public   WebDriver driver;
public  SearchpageObjects (WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//input[@name='query' and @placeholder='Search destinations']")
  private  WebElement where;
@FindBy(xpath = "//div[contains(text(), 'GeekyAnts, Bengaluru, Karnataka')]")
private WebElement location;

@FindBy(xpath = "//div[contains(text(), 'Check in')]")
private WebElement CheckInTab;

@FindBy(xpath = "//div[@class ='_nuyjria notranslate' and @data-testid='calendar-day-24/03/2024']")
private WebElement fromDate;
@FindBy(xpath = "//div[contains(text(), 'Check out')]")
private WebElement CheckOutTab;
@FindBy(xpath = "//div[@class ='_1aj90y58 notranslate' and @data-testid='calendar-day-28/03/2024']")
private WebElement ToDate;

@FindBy(xpath = "(//div[@class='c1sse431 atm_l8_srw7uq atm_ks_15vqwwr atm_mk_h2mmj6 atm_vv_1q9ccgz atm_vy_1osqo2v atm_wq_kb7nvz dir dir-ltr'])[3]")
private WebElement AddGuests;
@FindBy(xpath = "(//span[@class='i98ho2o atm_e2_qslrf5 atm_vy_qslrf5 atm_l8_14y27yu dir dir-ltr'])[2]")
private WebElement AdultsButton;
@FindBy(xpath = "//span[@class='t1dqvypu atm_9s_1ulexfb atm_vy_1osqo2v atm_e2_1osqo2v atm_jb_uuw12j atm_2w_1egmwxu atm_k4_idpfg4 atm_uc_kn5pbq atm_2g_ux2fpz atm_k4_kb7nvz_1nos8r atm_uc_yz1f4_csw3t1 atm_k4_idpfg4_csw3t1 atm_tr_kftzq4_csw3t1 dir dir-ltr']")
private WebElement SearchButton;
public void setDestinationField(String destination)
{
    where.sendKeys(destination);
    location.click();
}
public void setDates()
{
 CheckInTab.click();
 fromDate.click();
 CheckOutTab.click();
 ToDate.click();
}

public void AddGuestsOption()
{
    AddGuests.click();
    AdultsButton.click();
SearchButton.click();
}
}



