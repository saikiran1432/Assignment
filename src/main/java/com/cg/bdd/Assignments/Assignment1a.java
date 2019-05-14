package com.cg.bdd.Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment1a {
	

		WebDriver driver;
		
		@FindBy(linkText="Log in")
		private WebElement loginLink;
		
		@FindBy(id="Email")
		private WebElement emailTextField;
		
		@FindBy(id="Password")
		private WebElement passwordTextField;
		
		@FindBy(id= "RememberMe")
		private WebElement rememberCheckBox;
		
		@FindBy(xpath="//input[@value='Log in']")
		private WebElement loginButton;
		
		@FindBy(xpath="/html/body/div[4]/div/div[2]/ul[1]/li[1]/a")
		private WebElement booksLink;
		
		@FindBy(xpath="/html/body/div[4]/div/div[2]/ul[1]/li[2]/a")
		private WebElement computerLink;
		
		@FindBy(xpath="/html/body/div[4]/div/div[2]/ul[1]/li[3]/a")
		private WebElement electronicsLink;
		
		@FindBy(xpath="/html/body/div[4]/div/div[2]/ul[1]/li[4]/a")
		private WebElement apperalandshoesLink;
		
		@FindBy(xpath="/html/body/div[4]/div/div[2]/ul[1]/li[5]/a")
		private WebElement digitaldownloadsLink;
		
		@FindBy(xpath="/html/body/div[4]/div/div[2]/ul[1]/li[6]/a")
		private WebElement jewelleryLink;
		
		@FindBy(xpath="/html/body/div[4]/div/div[2]/ul[1]/li[7]/a")
		private WebElement giftcardsLink;
		
		
		public Assignment1a(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		public void clickLoginLink()
		{
			loginLink.click();
		}
		
		public void setPassword(String password)
		{
			passwordTextField.sendKeys(password);
		}
		public WebElement getLoginLink() {
			return loginLink;
		}
		public void setLoginLink() {
			this.loginLink.click();
		}
		public String getEmailTextField() {
			return this.emailTextField.getText();
		}
		public void setEmailTextField(String emailTextField) {
			this.emailTextField.sendKeys(emailTextField);
		}
		public String getPasswordTextField() {
			return this.passwordTextField.getText();
		}
		public void setPasswordTextField(String passwordTextField) {
			this.passwordTextField.sendKeys(passwordTextField);
		}
		
		public void clickOnRememberMe() 
		{
			this.rememberCheckBox.click();
		}

		public void clickLoginButton() {
			this.loginButton.click();
		}

		public void clickOnBooksLink()
		{
			System.out.println("before");
			booksLink.click();
		}
		
		public void clickOnComputerLink()
		{
			computerLink.click();
		}
		
		public void clickOnElectronicsLink()
		{
			electronicsLink.click();
		}
		
		public void clickOnApperalandshoesLink()
		{
			apperalandshoesLink.click();
		}
		
		public void clickOnDigitalDownloadsLink()
		{
			digitaldownloadsLink.click();
		}
		
		public void clickOnJewelleryLink()
		{
			jewelleryLink.click();
		}
		
		public void clickOnGiftcardsLink()
		{
			giftcardsLink.click();
		}

	}



