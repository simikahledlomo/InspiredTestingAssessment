package steps;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.Register;
import sharedServices.PublicFunctions;

public class NewOrderSteps {
	WebDriver driver;
	Register rp;
	HomePage hp;
	PublicFunctions pf;
	JavascriptExecutor js;
	
	@Given("The user has the baseURL {string} and browser {string}")
	public void the_user_has_the_base_url_and_browser(String baseURL, String browser) {
		 if(browser.equalsIgnoreCase("chrome")) {
		    	driver = new ChromeDriver();
		    }else if (browser.equalsIgnoreCase("firefox")) {
		    	driver = new FirefoxDriver();
		    } else {
		    	System.out.println("Driver not found!!");
		    }
		    
		    driver.get(baseURL);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("The user click register button")
	public void the_user_click_register_button() throws InterruptedException {
	    rp = new Register(driver);
	    rp.clickRegisterLink();
	    Thread.sleep(5000);
	}
	
	@Then("user select their gender {string}")
	public void user_select_their_gender(String gender) {
	    rp.selectGender(gender);
	}
	
	@Then("user enter first name {string}")
	public void user_enter_first_name(String firstName) {
	    rp.enterFirstName(firstName);
	}

	@Then("user enter last name {string}")
	public void user_enter_last_name(String lastName) {
	    rp.enterLastName(lastName);
	}

	@Then("User enter email address {string}")
	public void user_enter_email_address(String email) {
	   rp.enterEmail(email);
	}

	@Then("User enter password {string}")
	public void user_enter_password(String password) {
		rp.enterPassword(password);
	}

	@Then("User enter confirm password {string}")
	public void user_enter_confirm_password(String confirmPassword) {
	    rp.enterConfirmPassword(confirmPassword);
	}

	@Then("user click register button")
	public void user_click_register_button() {
	    rp.clickRegisterButton();
	}

	@Then("user click continue button")
	public void user_click_continue_button() {
	    rp.clickBtnContinue();
	}
	
	@Then("user click logout button")
	public void user_click_logout_button() throws InterruptedException {
	    rp.clickLogOut();
	    Thread.sleep(5000);
	}
	
	@When("The user click login link button")
	public void the_user_click_login_link_button() {
	   hp = new HomePage(driver);
	   
	   hp.clickLogIn();
	}
	
	@Then("user enter username {string}")
	public void user_enter_username(String email) {
	   rp.enterEmail(email);
	}
	
	@Then("user enter Login password {string}")
	public void user_enter_login_password(String password) {
		rp.enterPassword(password);
	}
	
	@Then("user click login")
	public void user_click_login() {
		hp.clickBtnLogIN();
	}
	
	@Then("user click computer")
	public void user_click_computer() {
	    hp.clickComputers();
	}
	
	@Then("user click desktop")
	public void user_click_desktop() throws InterruptedException {
	    hp.clickDesktops();
	    
	    js = (JavascriptExecutor)driver;
	    pf = new PublicFunctions(driver);
	    
	    WebElement element = hp.getBuildComputer();
	    pf.scrollElementINtoView(element, js);
	}
	
	@Then("user click build your own cheap computer")
	public void user_click_build_your_own_cheap_computer() {
	    hp.clickBuildComputer();
	}
	
	@Then("user click add to cart")
	public void user_click_add_to_cart(){
	    hp.clickAddToCsrtBtn();
	}
	
	@Then("user click shopping cart")
	public void user_click_shopping_cart() {
	   hp.clickShoppingCart();
	}
	
	@Then("user select {string} on the drop down")
	public void user_select_on_the_drop_down(String country) throws InterruptedException {
	    WebElement count = hp.getCountry();
	    pf.scrollElementINtoView(count, js);
	    pf.selectByVisibleText(country, count);
	}

	@Then("user click terms")
	public void user_click_terms() {
	    hp.clickTermsofservice();
	}

	@Then("user click checkout")
	public void user_click_checkout() throws InterruptedException {
	    hp.clickCheckout();
	    Thread.sleep(5000);
	}

	@Then("user select shiping address {string} on the drop down")
	public void user_select_shiping_address_on_the_drop_down(String string) throws InterruptedException {
	    WebElement elemnt = hp.getBillingNewAddress_CountryId();
	    pf.scrollElementINtoView(elemnt, js);
	    pf.selectByVisibleText(string, elemnt);
	}

	@Then("user enter city {string}")
	public void user_enter_city(String string) {
	    hp.enterBillingNewAddress_City(string);
	}

	@Then("user enter address one {string}")
	public void user_enter_address_one(String string) {
	    hp.enterBillingNewAddress_Address1(string);
	}

	@Then("user enter zipcode {string}")
	public void user_enter_zipcode(String zipcode) {
	    hp.enterBillingNewAddress_ZipPostalCode(zipcode);
	}

	@Then("user enter phone {string}")
	public void user_enter_phone(String string) {
	    hp.enterBillingNewAddress_PhoneNumber(string);
	}

	@Then("user click button continue")
	public void user_click_button_continue() {
	    hp.clickBillingContinue();
	}

	@Then("user click button in store pickup")
	public void user_click_button_in_store_pickup() {
	    hp.clickPickUpInStore();
	}

	@Then("user click button continue pickup")
	public void user_click_button_continue_pickup() {
	    hp.clickShippingContinue();
	}

	@Then("user click button continue payment method")
	public void user_click_button_continue_payment_method() {
	    hp.clickPaymentContinue();
	}

	@Then("user click button continue payment info")
	public void user_click_button_continue_payment_info() {
	    hp.clickPaymentINfoContinue();
	}

	@Then("user click button continue confirm order")
	public void user_click_button_continue_confirm_order() {
	    hp.clickConfirmOrderContinue();
	}

	@Then("user click button continue Thank you")
	public void user_click_button_continue_thank_you() {
	    hp.clickCompletedContinue();
	}
}
