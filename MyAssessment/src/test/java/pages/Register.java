package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebDriver driver;
	
	@FindBy(xpath = ".//a[text() = 'Register']")
	WebElement RegisterLink;
	
	@FindBy(id = "gender-male")
	WebElement Male;
	
	@FindBy(id = "gender-female")
	WebElement Female;
	
	@FindBy(id = "FirstName")
	WebElement FirstName;
	
	@FindBy(id = "LastName")
	WebElement LastName;
	
	@FindBy(id = "Email")
	WebElement Email;
	
	@FindBy(id = "Password")
	WebElement Password;
	
	@FindBy(id = "ConfirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(id = "register-button")
	WebElement RegisterButton;
	
	@FindBy(xpath = ".// input [@class = 'button-1 register-continue-button']")
	WebElement BtnContinue;
	
	@FindBy(xpath = ".//a[text() = 'Log out']")
	WebElement LogOut;
	
	
	public Register(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickRegisterLink() {
		this.RegisterLink.click();
	}
	
	public void selectGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			this.Male.click();
		} else if(gender.equalsIgnoreCase("female")) {
			this.Female.click();
		}
	}
	
	public void enterFirstName(String FirstName) {
		this.FirstName.sendKeys(FirstName);;
	}
	
	public void enterLastName(String LastName) {
		this.LastName.sendKeys(LastName);;
	}
	
	public void enterEmail(String Email) {
		this.Email.sendKeys(Email);;
	}
	
	public void enterPassword(String Password) {
		this.Password.sendKeys(Password);;
	}
	
	public void enterConfirmPassword(String ConfirmPassword) {
		this.ConfirmPassword.sendKeys(ConfirmPassword);;
	}
	
	public void clickRegisterButton() {
		this.RegisterButton.click();
	}
	
	public void clickBtnContinue() {
		this.BtnContinue.click();
	}
	
	public void clickLogOut() {
		this.LogOut.click();
	}
}
