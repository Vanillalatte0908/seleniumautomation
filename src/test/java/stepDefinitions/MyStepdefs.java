package stepDefinitions;

// Ensure this import is present
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {
    WebDriver driver;

    @Given("I open the Google homepage")
    public void iOpenTheGoogleHomepage() {
        System.setProperty("webdriver.firefox.driver", "/Applications/Firefox.app/Contents/MacOS/:/Applications/Firefox.app/Contents/MacOS/");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }

    @Then("the title should be {string}")
    public void theTitleShouldBe(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        driver.quit();
    }
}
