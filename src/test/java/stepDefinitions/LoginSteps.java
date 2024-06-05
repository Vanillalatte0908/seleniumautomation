package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

public class LoginSteps {

    WebDriver driver;

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
           System.setProperty("webdriver.firefox.driver", "/Applications/Firefox.app/Contents/MacOS/:/Applications/Firefox.app/Contents/MacOS/");
        driver = new FirefoxDriver();
        driver.get("https://example.com/login");
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        String expectedUrl = "https://example.com/home";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        driver.quit();
    }
}