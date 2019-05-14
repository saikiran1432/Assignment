package com.cg.bdd.stepdef;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.bdd.Assignments.Assignment1a;

import cucumber.api.java.en.*;

public class StepDefinationForLinks
{
	WebDriver driver;
		Assignment1a as;
	@Given("^user is on the homepage$")
	public void user_is_on_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com");
	    driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
	    as = new Assignment1a(driver);
	}
        
	@When("^user clicks on the books links$")
	public void user_clicks_on_the_books_links() throws Throwable {
	    
	    as.clickOnBooksLink();
	}

	@Then("^demo webshop books page should be opened$")
	public void demo_webshop_books_page_should_be_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("books page has opened");
	}

	@When("^user clicks on the computer links$")
	public void user_clicks_on_the_computer_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    as.clickOnComputerLink();
	}

	@Then("^demo webshop computer page should be opened$")
	public void demo_webshop_computer_page_should_be_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("computer page has opened");
	}

	@When("^user clicks on the electronics links$")
	public void user_clicks_on_the_electronics_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    as.clickOnElectronicsLink();
	}

	@Then("^demo webshop electronics page should be opened$")
	public void demo_webshop_electronics_page_should_be_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("electronics page has opened");
	}

	@When("^user clicks on the apparel and shoes links$")
	public void user_clicks_on_the_apparel_and_shoes_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    as.clickOnApperalandshoesLink();
	}

	@Then("^demo webshop apparel and shoes page should be opened$")
	public void demo_webshop_apparel_and_shoes_page_should_be_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("apparel and shoes  page has opened");
	}

	@When("^user clicks on the digital downloads links$")
	public void user_clicks_on_the_digital_downloads_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    as.clickOnDigitalDownloadsLink();
	}

	@Then("^demo webshop digital downloads page should be opened$")
	public void demo_webshop_digital_downloads_page_should_be_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("digitaldownloads page has opened");
	}

	@When("^user clicks on the jewellery links$")
	public void user_clicks_on_the_jewellery_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    as.clickOnJewelleryLink();
	}

	@Then("^demo webshop jewellery page should be opened$")
	public void demo_webshop_jewellery_page_should_be_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("jewellery page has opened");
	}

	@When("^user clicks on the gift cards links$")
	public void user_clicks_on_the_gift_cards_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    as.clickOnGiftcardsLink();
	}

	@Then("^demo webshop gift cards page should be opened$")
	public void demo_webshop_gift_cards_page_should_be_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("giftcards page has opened");
	}
}
