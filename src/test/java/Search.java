import org.PageObjects.SearchpageObjects;
import org.testng.annotations.Test;

public class Search extends BaseTest {
    @Test(priority=0)
    public void Search()
    {

        SearchpageObjects SearchPage = new SearchpageObjects(driver);
        SearchPage.setDestinationField("Geekyants");
        SearchPage.setDates();
        SearchPage.AddGuestsOption();


    }
}
