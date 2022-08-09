package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US001 {


    public US001() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountButton;

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnRequiredMessage;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameTextBox;

}
