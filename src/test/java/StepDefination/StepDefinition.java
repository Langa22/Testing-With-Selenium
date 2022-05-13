package StepDefination;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import sun.security.util.PendingException;

import javax.xml.bind.Element;
import java.util.List;

@RunWith(Cucumber.class)
public class StepDefinition {
        WebDriver driver;
        @When("^User opens facebook registration page$")
        public void user_opens_facebook_registration_page(){
                System.setProperty("webdriver.chrome.driver", "C:/Users/CMDQ123/Downloads/chromedriver_win32/chromedriver.exe");
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653399747&extra_1=s%7Cc%7C358646689891%7Ce%7Cfacebook%20create%20new%20account%7C&placement=&creative=358646689891&keyword=facebook%20create%20new%20account&partner_id=googlesem&extra_2=campaignid%3D1653399747%26adgroupid%3D68955935412%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-311595197486%26loc_physical_ms%3D1028688%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwg_iTBhDrARIsAD3Ib5hQantPmIA73O2PAc6NfzGWimId9MjAQ1Wk2osfF_22d1OSmdF3yAMaAqnZEALw_wcB");
        }@Then("^User enters First Name$")
        public void user_enters_first_name() throws InterruptedException {
                WebElement element= driver.findElement(By.name("firstname"));
                element.sendKeys("Lunga");
                //driver.wait(5000);
        }
        @Then("^User enters Last Name$")
        public void user_enters_last_name() throws InterruptedException {
                WebElement element2= driver.findElement(By.name("lastname"));
                element2.sendKeys("Lungas");
                //driver.wait(100000);
        }
        @Then("^User enters Mobile number or email$")
        public void user_enters_mobile_number_or_email() {
                WebElement element3= driver.findElement(By.name("reg_email__"));
                element3.sendKeys("0655068465");
        }
        @Then("^User enters Password$")
        public void user_enters_password()  {
                WebElement element4= driver.findElement(By.name("reg_passwd__"));
                element4.sendKeys("password1234");
        }
        @Then("^User Selects date of birth$")
        public void user_selects_date_of_birth() throws Throwable {
                Select drp= new Select(driver.findElement(By.name("birthday_day")));
                drp.selectByVisibleText("30");
                Select drp2= new Select(driver.findElement(By.name("birthday_month")));
                drp2.selectByVisibleText("Jan");
                Select drp3= new Select(driver.findElement(By.name("birthday_year")));
                drp3.selectByVisibleText("1999");
        }

        @Then("^User Selects Gender$")
        public void user_selects_gender()  {
                WebElement gender= driver.findElement(By.name("sex"));
                gender.click();
        }
        @Then("^User clicks sign in button$")
        public void user_selects_sign_in_button() {
                WebElement w= driver.findElement(By.name("websubmit"));
                w.click();
        }
        /*@Then("^User enters code$")
        public void user_enters_code() {
                WebElement w2= driver.findElement(By.id("code_in_cliff"));
                w2.sendKeys("96619");

        }

        /*@And("^ Facebook account has been created$")
        public void facebook_account_has_been_created() throws Throwable {
                throw new PendingException();
        }*/

}

