package com.cg.bdd.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.bdd.Assignments.Assignment1a;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	WebDriver driver;
	Assignment1a as;
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		as = new Assignment1a(driver);
		as.clickOnRememberMe();
		as.clickLoginLink();
	}

	@When("^valid user name and password are given and clicks on login$")
	public void valid_user_name_and_password_are_given_and_clicks_on_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    as.setEmailTextField("saikiran@gmail.com");
	    as.setPasswordTextField("saikiran");
	    
	    as.clickLoginButton();
	}

	@Then("^Login page should be displayed$")
	public void login_page_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("login page is executed");
	}

}
