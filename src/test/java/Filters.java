import org.PageObjects.FilterspageObjects;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Filters extends BaseTest{

    @Test(priority=1)
    public void filters()
    {


    FilterspageObjects filters=new FilterspageObjects(driver);
    filters.FilterOption();
        String heading = filters.FiltersPageTitle.getText();
        Assert.assertEquals("Filters", heading);
        filters.ApplyFilters();

//       Actions actions = new Actions(driver);
//        WebElement srcElement = driver.findElement(By.xpath("//button[@aria-valuenow='830']"));
//        WebElement targetElement = driver.findElement(By.xpath("//button[@aria-valuenow='1101']"));
//        actions.dragAndDrop(srcElement, targetElement);
//        actions.build().perform();


//Building a drag and drop action
//        Action dragAndDrop = builder.clickAndHold(fromElement)
//                .moveToElement(toElement)
//                .release(toElement)
//                .build();

//Performing the drag and drop action
        //dragAndDrop.perform();

    }
}
