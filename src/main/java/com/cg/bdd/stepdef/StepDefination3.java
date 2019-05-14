package com.cg.bdd.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.bdd.Assignments.*;

import cucumber.api.java.en.*;

public class StepDefination3
{
	WebDriver driver;
	Assignment1a as;
	Assignment3a asgn;
	
	@Given("^user is on the loginpage$")
	public void user_is_on_the_loginpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		as=new Assignment1a(driver);
		asgn=new Assignment3a(driver);
		as.clickLoginLink();
	}

	@When("^the user enters the valid username and password and clicks login button$")
	public void the_user_enters_the_valid_username_and_password_and_clicks_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		as.setEmailTextField("saikiran@gmail.com");
	    as.setPasswordTextField("saikiran");
	    as.clickLoginButton();
	}

	@Then("^login page should be displayed$")
	public void login_page_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^the user is on loginpage and clicks apperal and shoe link$")
	public void the_user_is_on_loginpage_and_clicks_apperal_and_shoe_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    asgn=new Assignment3a(driver);
	    asgn.clickOnApperalandshoesLink();
	}
	@Then("^Apparel and shoes page should be displayed$")
	public void apparel_and_shoes_page_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	@When("^user selects the blue jeans$")
	public void user_selects_the_blue_jeans() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    asgn.clickOnBlueJeansLink();
	}

	@Then("^blue jeans page details are displayed$")
	public void blue_jeans_page_details_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user clicks on add to cart$")
	public void user_clicks_on_add_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    asgn.clickOnAddToCart();
	}

	@Then("^a popup should be displayed that jeans is added to cart$")
	public void a_popup_should_be_displayed_that_jeans_is_added_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user clicks on shipping cart$")
	public void user_clicks_on_shipping_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    asgn.clickOnShoppingCart();
	}

	@Then("^shipping cart page should be opened$")
	public void shipping_cart_page_should_be_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User gives estimate shipping details and clicks on iagree checkbox and clicks on checkout button$")
	public void user_gives_estimate_shipping_details_and_clicks_on_iagree_checkbox_and_clicks_on_checkout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  asgn.countryDropdown("India");
		  asgn.enterZipCode("500049");
		  asgn.clickOnCheckBox();
		  asgn.clickOnCheckoutButton();
	}

	@Then("^checkout page should be displayed$")
	public void checkout_page_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user clicks on continue in the billingaddress section$")
	public void user_clicks_on_continue_in_the_billingaddress_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    asgn.clickOnBillingContinueButton();
	}

	@Then("^it should go to next shipping address section$")
	public void it_should_go_to_next_shipping_address_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user clicks continue in the shipping address section$")
	public void user_clicks_continue_in_the_shipping_address_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    asgn.clickOnShippingContinueButton();
	}

	@Then("^it should go to shippingaddress section$")
	public void it_should_go_to_shippingaddress_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^in the shippingaddress user should select ground radio button$")
	public void in_the_shippingaddress_user_should_select_ground_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    asgn.clickOnGroundButton();
	}

	@When("^user clicks on continue$")
	public void user_clicks_on_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    asgn.clickOnShippingMethodButton();
	}

	@Then("^it should go to payment method section$")
	public void it_should_go_to_payment_method_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user selects creditcard and clicks continue$")
	public void user_selects_creditcard_and_clicks_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    asgn.clickOnPaymentMethod();
	    asgn.clickOnPaymentMethodButton();
	}

	@Then("^user should go to payment information section$")
	public void user_should_go_to_payment_information_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enters the card details and clicks on continue$")
	public void user_enters_the_card_details_and_clicks_on_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		asgn.paymentInformation("Visa");
	    asgn.cardHolderTextField("Barbara Gordon");
	    asgn.cardNumberTextField("4485564059489345");
	    asgn.clickOnExpireMonth("04");
	    asgn.clickOnExpireYear("2020");
	    asgn.cardCodeTextField("123");
	    asgn.paymentInfoButton();
	}

	@Then("^user should go to confirm order section$")
	public void user_should_go_to_confirm_order_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user clicks on continue in the confirm order section$")
	public void user_clicks_on_continue_in_the_confirm_order_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		asgn.confirmOrderButton();
	}

	@Then("^order is sucessful message should be displayed$")
	public void order_is_sucessful_message_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user clicks on the continue below the sucessful meaasge$")
	public void user_clicks_on_the_continue_below_the_sucessful_meaasge() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		asgn.confirmContinueButton();
	}

	@Then("^user should be directed to homepage$")
	public void user_should_be_directed_to_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user clicks on the logoutlink$")
	public void user_clicks_on_the_logoutlink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		asgn.logOutButton();
	}

	@Then("^demowebshop homepage should be displayed$")
	public void demowebshop_homepage_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
