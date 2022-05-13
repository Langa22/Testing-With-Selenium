package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinition1 {
    WebDriver driver1;
    @When("^User opens Amazon URL$")
    public void user_opens_amazon_url() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/CMDQ123/Downloads/chromedriver_win32/chromedriver.exe");
    driver1=new ChromeDriver();
    driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver1.get("https://www.amazon.in//");
    }
    @Then("^Searches for headphones$")
    public void searches_for_headphones(){
    WebElement ear= driver1.findElement(By.id("twotabsearchtextbox"));
    ear.sendKeys("Earphones",Keys.ENTER);
    }
    @Then("^Save the URL of headphones$")
    public void save_the_url_of_headphones() {
    }
    @Then("^open new tab$")
    public void open_new_tab(){

    }

    @And("^Switch to the new tab and launch the stored URL$")
    public void switch_to_the_new_tab_and_launch_the_stored_url(){

    }

}
