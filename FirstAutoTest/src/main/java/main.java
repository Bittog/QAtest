import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "browserDrivers/chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.google.com");
                driver.manage().window().maximize();


                String searchFieldXpath = "//input[@name = 'q']";
                WebElement searchElement = driver.findElement(By.xpath(searchFieldXpath));

                searchElement.sendKeys("softserve it academy");
                searchElement.submit();

                String searchFieldXpath1 = "//a[@href='https://career.softserveinc.com/uk-ua/learning-and-certification']";
                WebElement searchElement1 = driver.findElement(By.xpath(searchFieldXpath1));
                searchElement1.click();

                //driver.getCurrentUrl();//

                String URL = driver.getCurrentUrl();
                String Actualtext = driver.findElement(By.linkText("https://career.softserveinc.com/uk-ua/learning-and-certification")).getText();

        driver.quit();

    }
}
