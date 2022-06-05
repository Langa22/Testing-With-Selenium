package StepDefination;
import com.sun.java.swing.plaf.windows.resources.windows;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class StepDefinition1 {
    WebDriver driver1;
    Set<String>windows;
    Iterator<String> iterator;
    String parentWindow;
    String childWindow;
    String childWindow1;
    @When("^User opens Amazon URL$")
    public void user_opens_amazon_url() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/CMDQ123/Downloads/chromedriver_win32/chromedriver.exe");
    driver1=new ChromeDriver();
    driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver1.get("https://www.amazon.in//");
    driver1.manage().window().maximize();
    }
    @Then("^Searches for headphones$")
    public void searches_for_headphones(){
    WebElement ear= driver1.findElement(By.id("twotabsearchtextbox"));
    ear.sendKeys("Earphones",Keys.ENTER);
    }
    @Then("^select headphones$")
    public void select_heardphones() throws Throwable {
     driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     WebElement w= driver1.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
     w.click();
     windows=driver1.getWindowHandles();
     iterator=windows.iterator();
     parentWindow= iterator.next();
     childWindow=iterator.next();
     driver1.switchTo().window(childWindow);
    }
    @Then("^Add to cart$")
    public void add_to_cart() {
    driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement web= driver1.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
    web.click();
    }
    @Then("^Go back to the home window and search laptops$")
    public void go_back_to_the_home_window_and_search_laptops(){
        driver1.switchTo().window(parentWindow);
        driver1.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
        WebElement ear= driver1.findElement(By.id("twotabsearchtextbox"));
        ear.sendKeys("Laptops",Keys.ENTER);
    }
    @Then("^Select the laptop$")
    public void select_the_laptop() {
        WebElement lap= driver1.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
        lap.click();
        windows=driver1.getWindowHandles();
        iterator=windows.iterator();
        parentWindow= iterator.next();
        childWindow=iterator.next();
        childWindow1=iterator.next();
        driver1.switchTo().window(childWindow1);
    }
    @Then("^Add the laptop to cart$")
    public void add_the_laptop_to_cart() {
        WebElement web= driver1.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
        web.click();
    }
    @And("^Go back to the home page$")
    public void go_back_to_the_home_page() {
     driver1.switchTo().window(parentWindow);
    }
}
