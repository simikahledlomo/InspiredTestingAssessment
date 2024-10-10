package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath = ".//a [text() = 'Log in']")
	WebElement LogIn;
	
	@FindBy(xpath = ".//input [@class = 'button-1 login-button']")
	WebElement BtnLogIN;
	
	@FindBy(xpath = ".//div [@class = 'listbox']//ul//li//a[@href= '/computers']")
	WebElement Computers;
	
	@FindBy(xpath = ".//img [@alt = 'Picture for category Desktops']")
	WebElement Desktops;
	
	@FindBy(xpath = ".//div [@class = 'details']//a[text() = 'Build your own cheap computer']")
	WebElement BuildComputer;
	
	@FindBy(id = "add-to-cart-button-72")
	WebElement AddToCsrtBtn;
	
	@FindBy(xpath = ".//span [text() = 'Shopping cart']")
	WebElement ShoppingCart;
	
	@FindBy(id = "CountryId")
	WebElement CountryId;
	
	@FindBy(id = "termsofservice")
	WebElement Termsofservice;
	
	@FindBy(id = "checkout")
	WebElement Checkout;
	
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement BillingNewAddress_CountryId;
	
	@FindBy(id = "BillingNewAddress_City")
	WebElement BillingNewAddress_City;
	
	@FindBy(id = "BillingNewAddress_Address1")
	WebElement BillingNewAddress_Address1;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement BillingNewAddress_ZipPostalCode;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement BillingNewAddress_PhoneNumber;
	
	@FindBy(xpath = ".//div [@id= 'billing-buttons-container' ]//input [@type = 'button' ]")
	WebElement BillingContinue;
	
	@FindBy(id = "PickUpInStore")
	WebElement PickUpInStore;
	
	@FindBy(xpath = ".//li [@id = 'opc-shipping']//input [@class = 'button-1 new-address-next-step-button']")
	WebElement ShippingContinue;
	
	@FindBy(xpath = ".//li [@id = 'opc-shipping_method']//input [@class = 'button-1 shipping-method-next-step-button']")
	WebElement CheckoutContinue;
	
	@FindBy(xpath = ".//input [@class ='button-1 payment-method-next-step-button']")
	WebElement PaymentContinue;
	
	@FindBy(xpath = ".//input [@class ='button-1 payment-info-next-step-button']")
	WebElement PaymentINfoContinue;
	
	@FindBy(xpath = ".//input [@class ='button-1 confirm-order-next-step-button']")
	WebElement ConfirmOrderContinue;
	
	@FindBy(xpath = ".//input [@class ='button-2 order-completed-continue-button']")
	WebElement CompletedContinue;

	
	

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void clickLogIn() {
		this.LogIn.click();
	}
	
	public void clickBtnLogIN() {
		this.BtnLogIN.click();;
	}
	
	public void clickComputers() {
		this.Computers.click();
	}
	
	public void clickDesktops() {
		this.Desktops.click();;
	}
	
	public WebElement getBuildComputer() {
		return this.BuildComputer;
	}
	
	public void clickBuildComputer() {
		this.BuildComputer.click();
	}
	
	public void clickAddToCsrtBtn() {
		this.AddToCsrtBtn.click();
	}
	
	public void clickShoppingCart() {
		this.ShoppingCart.click();
	}
	
	public WebElement getCountry() {
		return this.CountryId;
	}
	
	public void clickTermsofservice() {
		this.Termsofservice.click();
	}
	
	public void clickCheckout() {
		this.Checkout.click();;
	}
	
	public WebElement getBillingNewAddress_CountryId() {
		return this.BillingNewAddress_CountryId;
	}
	
	public void enterBillingNewAddress_City(String City) {
		this.BillingNewAddress_City.sendKeys(City);
	}
	
	public void enterBillingNewAddress_Address1(String Address1) {
		this.BillingNewAddress_Address1.sendKeys(Address1);;
	}
	
	public void enterBillingNewAddress_ZipPostalCode(String int1) {
		this.BillingNewAddress_ZipPostalCode.sendKeys(int1);
	}
	
	public void enterBillingNewAddress_PhoneNumber(String phone) {
		this.BillingNewAddress_PhoneNumber.sendKeys(phone);
	}
	
	public void clickBillingContinue() {
		this.BillingContinue.click();
	}
	
	public void clickPickUpInStore() {
		this.PickUpInStore.click();
	}
	
	public void clickShippingContinue() {
		this.ShippingContinue.click();
	}
	
	public void clickCheckoutContinue() {
		this.CheckoutContinue.click();
	}
	
	public void clickPaymentContinue() {
		this.PaymentContinue.click();;
	}
	
	public void clickPaymentINfoContinue() {
		this.PaymentINfoContinue.click();
	}
	
	public void clickConfirmOrderContinue() {
		this.ConfirmOrderContinue.click();;
	}
	
	public void clickCompletedContinue() {
		this.CompletedContinue.click();
	}
}
