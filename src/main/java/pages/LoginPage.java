package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nththuy on 12/31/19.
 */
public class LoginPage {
    private WebDriver driver;


    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[1]/button")
    WebElement customerLogin;


    //Constructor
    public LoginPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Thread.sleep(3000);
    }

    public void clickOpenWebsite() throws InterruptedException {
        customerLogin.click();
        Thread.sleep(3000);

    }



}
