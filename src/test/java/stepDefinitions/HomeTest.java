package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeTest {
    public WebDriver driver;
    @Given("I am on the Browser")
    public void TheBrowser()
    {
        // Implementation goes here
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @When("I navigate to the {string}")
    public void navigateToTheUrl(String url)
    {
        driver.get(url);
    }

    @Then("I should see the WelcomePage")
    public void shouldSeeTheWelcomePage()
    {
        driver.quit();
    }

}
