import org.PageObjects.BookingpageObjects;
import org.Utils.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class Booking extends BaseTest {
@Test(priority=2)

    public void Booking() throws InterruptedException {

//        String Name = driver.findElement(By.xpath("(//div[@data-testid='listing-card-title'])[1]")).getText();
//        System.out.println(Name);
 //               String secondName = driver.findElement(By.xpath("(//h2[@tabindex='-1'])[1]")).getText();
//                Assert.assertTrue(secondName.contains(Name), "Names are not matching:(");
//              System.out.println(  driver.getCurrentUrl());
 //               Thread.sleep(5000);
        BookingpageObjects booking=new BookingpageObjects(driver);
        booking.Booking();



            }
        }


