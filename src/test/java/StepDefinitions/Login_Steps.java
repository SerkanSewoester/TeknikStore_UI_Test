package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Login_Steps {
    DialogContent dc = new DialogContent(GWD.getDriver());
    @Given("User navigates to the website")
    public void userNavigatesToTheWebsite() {
        GWD.getDriver().get("https://www.teknikstore.com");
    }

    @When("User enters mail and password")
    public void userEntersMailAndPassword() {
        MyFunc.myClick(GWD.getDriver().findElement(By.xpath("(//*[text()='Giriş Yap'])[1]")));
        MyFunc.mySendKeys(GWD.getDriver().findElement(By.xpath("//*[@placeholder='E-posta Adresiniz1']")),"asd");


    }

    @And("Clicks the login button")
    public void clicksTheLoginButton() {

    }
}
