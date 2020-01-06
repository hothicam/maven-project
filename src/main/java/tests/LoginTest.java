package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import runner.TestRunner;

public class LoginTest extends PageProvider {

    @Given("^Open banking website (.*)$")
    public void Open_banking_website (String website) throws InterruptedException {
        TestRunner.driver.get(website);
        Thread.sleep(3000);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Then("^I click Customer Login button$")
    public void clickCustomerLogin() throws InterruptedException {
        Thread.sleep(3000);
        getLoginPage().clickOpenWebsite();
        Thread.sleep(3000);
    }


}
