import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
public class BaseTest {
        public WebDriver driver;
    @BeforeClass

        public void configure() {
            driver = new ChromeDriver();
            driver.get("https://www.airbnb.co.in/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }


