package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;


public class StepDefinition2 {
    WebDriver driver2;

    @When("^user searches opens Google chrome$")
    public void user_searches_opens_google_chrome() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/CMDQ123/Downloads/chromedriver_win32/chromedriver.exe");
        driver2=new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://www.google.com");
    }
    @Then("^User clicks on search and type in take a lot$")
    public void user_clicks_on_search_and_type_in_take_a_lot()  {
       WebElement webElement= driver2.findElement(By.name("q"));
       webElement.sendKeys("takealot.com");
       webElement.sendKeys(Keys.ENTER);
    }
    @Then("^Clicks on search button$")
    public void clicks_on_search_button() {
        WebElement webElement2= driver2.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3"));
        webElement2.click();
    }
    @Then("^Scroll down to Daily Deals$")
    public void scroll_down_to_daily_deals() throws AWTException {
        /*JavascriptExecutor js=(JavascriptExecutor) driver2;
        js.executeScript("window.scrollBy(0,10000)","");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_END);
        robot.keyRelease(KeyEvent.VK_END);
        robot.keyRelease(KeyEvent.VK_CONTROL);*/
    }
    @Then("^click on My Account$")
    public void click_on_My_Account() {
        WebElement select= driver2.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div[1]/ul/li[4]/button"));
        select.click();
        Select dropdown=new Select(select);
        dropdown.deselectByIndex(0);
    }

    @Then("^click on orders$")
    public void click_on_orders() {
        WebElement webElement3= driver2.findElement(By.xpath("/html/body/div[1]/div[4]/div/section/div/div/section/div/div[1]/div/ul/li[1]/a"));
        webElement3.click();
    }
   /* @Then("^Click on Login$")
    public void click_on_login() {
        WebElement webElement4= driver2.findElement(By.xpath(""));
        webElement4.click();
*/



}
