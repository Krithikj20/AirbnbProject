package org.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FilterspageObjects {
    public WebDriver driver;

    public  FilterspageObjects (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//span[@class='i1fo7oz atm_9s_11p5wf0 atm_fe_1h6ojuz atm_h_1h6ojuz atm_d5_1bp4okc atm_lo_ee9vc4 atm_lk_xvenqj atm_ll_xvenqj atm_cx_logulu dir dir-ltr']")
        private WebElement FilterButton;
@FindBy(xpath = "//div[@class='e1p58pdz atm_ks_15vqwwr atm_sq_1l2sidv dir dir-ltr']")
public WebElement FiltersPageTitle;
@FindBy(xpath = "(//span[@class='tndaegq atm_7l_1r7l3yf atm_cs_qo5vgd t1cwnpn8 atm_c8_8ycq01__oggzyc atm_g3_adnk3f__oggzyc atm_fr_rvubnj__oggzyc dir dir-ltr'])[1]")
private WebElement AnyTypeButton;
@FindBy(xpath = "(//span[@class='t15sb9tj atm_cs_atq67q atm_c8_fkimz8 atm_g3_11yl58k atm_fr_4ym3tx dir dir-ltr'])[2]")
private WebElement BedRoomsOption;
@FindBy(xpath = "(//span[@class='t15sb9tj atm_cs_atq67q atm_c8_fkimz8 atm_g3_11yl58k atm_fr_4ym3tx dir dir-ltr'])[11]")
private WebElement BedsOption;
@FindBy(xpath = "(//span[@class='t15sb9tj atm_cs_atq67q atm_c8_fkimz8 atm_g3_11yl58k atm_fr_4ym3tx dir dir-ltr'])[20]")
private WebElement BathroomsOption;
@FindBy(xpath = "(//span[@class='l18q5llv atm_ks_15vqwwr atm_9s_1txwivl atm_h_1h6ojuz atm_fc_1h6ojuz atm_h0_xvenqj atm_ax_idpfg4 atm_bb_idpfg4 atm_5j_idpfg4 atm_vy_1ylpe5n atm_e2_1ylpe5n atm_gq_xwaa7j atm_gq_sewhje__oggzyc dir dir-ltr'])[1]")
private WebElement GuestFavouritesOption;
@FindBy(xpath = "(//span[@class='m1hfo47l atm_9s_1ulexfb dir dir-ltr'])[1]")
private WebElement PropertyType;
@FindBy(xpath = "//div[@id='filter-item-amenities-8-row-title']")
private WebElement Kitchen;
    @FindBy(xpath = "//div[@id='filter-item-amenities-5-row-title']")
    private WebElement AirConditioning;
    @FindBy(xpath = "(//div[@class='s195dsor atm_5j_1ssbidh atm_66_nqa18y atm_e2_1vi7ecw atm_fq_1n1ank9 atm_mk_stnw88 atm_tk_1n1ank9 atm_tr_1jbocfw atm_vy_1vi7ecw atm_2d_gljq16 atm_9s_1txwivl atm_h_1h6ojuz atm_fc_1h6ojuz atm_6h_yh40bf atm_uc_1g0dpez atm_uc_glywfm__1rrf6b5 atm_4b_70a7u9_1o5j5ji atm_7l_xgd4j5_1o5j5ji slxkbsd atm_4b_1mw4akk dir dir-ltr'])[2]")
   private WebElement SelfCheckIn;

    @FindBy(id = "filter-item-languages-1-row-checkbox")
    private WebElement EnglishButton;
    @FindBy(xpath = "//a[@class='l1ovpqvx atm_1y33qqm_1ggndnn_10saat9 atm_17zvjtw_zk357r_10saat9 atm_w3cb4q_il40rs_10saat9 atm_1cumors_fps5y7_10saat9 atm_52zhnh_1s82m0i_10saat9 atm_jiyzzr_1d07xhn_10saat9 bmx2gr4 atm_9j_tlke0l atm_9s_1o8liyq atm_gi_idpfg4 atm_mk_h2mmj6 atm_r3_1h6ojuz atm_rd_glywfm atm_70_5j5alw atm_vy_1wugsn5 atm_tl_1gw4zv3 atm_9j_13gfvf7_1o5j5ji c1ih3c6 atm_bx_1ltc5j7 atm_c8_8ycq01 atm_g3_adnk3f atm_fr_rvubnj atm_cs_qo5vgd atm_5j_9l7fl4 atm_kd_glywfm atm_l8_srw7uq atm_uc_1etn2gc atm_r2_1j28jx2 atm_jb_1fkumsa atm_3f_glywfm atm_26_ljdcfo atm_7l_1dae3rm atm_8w_1t7jgwy atm_uc_glywfm__1rrf6b5 atm_kd_glywfm_1w3cfyq atm_uc_x37zl0_1w3cfyq atm_70_gxu55l_1w3cfyq atm_3f_glywfm_e4a3ld atm_l8_idpfg4_e4a3ld atm_gi_idpfg4_e4a3ld atm_3f_glywfm_1r4qscq atm_kd_glywfm_6y7yyg atm_uc_glywfm_1w3cfyq_1rrf6b5 atm_kd_glywfm_18zk5v0 atm_uc_x37zl0_18zk5v0 atm_70_gxu55l_18zk5v0 atm_3f_glywfm_6mgo84 atm_l8_idpfg4_6mgo84 atm_gi_idpfg4_6mgo84 atm_3f_glywfm_16p4kaz atm_kd_glywfm_17yx6rv atm_uc_glywfm_18zk5v0_1rrf6b5 atm_tr_18md41p_csw3t1 atm_k4_kb7nvz_1o5j5ji atm_3f_glywfm_1nos8r_uv4tnr atm_26_1sutpmb_1nos8r_uv4tnr atm_7l_1dae3rm_1nos8r_uv4tnr atm_3f_glywfm_4fughm_uv4tnr atm_26_q1if7f_4fughm_uv4tnr atm_7l_1dae3rm_4fughm_uv4tnr atm_3f_glywfm_csw3t1 atm_26_1sutpmb_csw3t1 atm_7l_1dae3rm_csw3t1 atm_3f_glywfm_1o5j5ji atm_26_q1if7f_1o5j5ji atm_7l_1dae3rm_1o5j5ji dir dir-ltr']")
    private WebElement ShowPlaceButton;


    public void FilterOption()
    {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//span[@class='i1fo7oz atm_9s_11p5wf0 atm_fe_1h6ojuz atm_h_1h6ojuz atm_d5_1bp4okc atm_lo_ee9vc4 atm_lk_xvenqj atm_ll_xvenqj atm_cx_logulu dir dir-ltr']")));
        FilterButton.click();
    }

    public void ApplyFilters()
    {
AnyTypeButton.click();
BedRoomsOption.click();
BedsOption.click();
BathroomsOption.click();
        GuestFavouritesOption.click();
        PropertyType.click();
        Kitchen.click();
        AirConditioning.click();
        SelfCheckIn.click();
        EnglishButton.click();
        ShowPlaceButton.click();
    }
}
