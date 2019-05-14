package com.cg.bdd.Assignments;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Assignment3a {
	
	WebDriver driver;
	Select s1;
	
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/ul[1]/li[4]/a")
	private WebElement apperalandshoesLink;
	
	@FindBy(linkText="Blue Jeans")
	private WebElement blueJeansLink;
	
	@FindBy(id="add-to-cart-button-36")
	private WebElement addToCartButton;

	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(id="CountryId")
	private WebElement countryIdDrpdown;
	
	@FindBy(id="ZipPostalCode")
	private WebElement zipCodeTextField;
	
	@FindBy(id="termsofservice")
	private WebElement iAgreeCheckBox;
	
	@FindBy(id="checkout")
	private WebElement checkoutButton;
	
	
	@FindBy(xpath="//input[@onclick='Billing.save()']")
	private WebElement billingContinueButton;
	
	
	@FindBy(xpath="//input[@class='button-1 new-address-next-step-button']")
	private WebElement shippingContinueButton;
	
	@FindBy(xpath="//input[@value='Ground___Shipping.FixedRate']")
	private WebElement groundButton;
	
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethodContinueButton;
	
	@FindBy(xpath="//input[@value='Payments.Manual']")
	private WebElement paymentMethodRadioButton;
	
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethodContinueButton;
	
	@FindBy(id="CreditCardType")
	private WebElement typeOfCreditCard;
	
	@FindBy(id="CardholderName")
	private WebElement CardholderNameTextField;
	
	@FindBy(id="CardNumber")
	private WebElement cardNumberTextField;
	
	@FindBy(xpath="//input=[@select='ExpireMonth']")
	private WebElement expireMonthDropDown;
	
	@FindBy(xpath="//input=[@name='ExpireYear']")
	private WebElement expireYearDropDown;
	
	@FindBy(id="CardCode")
	private WebElement cardCodeNumber;
	
	@FindBy(xpath="//input=[@onclick='PaymentInfo.save()']")
	private WebElement paymentInfoContinueButton;
	
	@FindBy(xpath="//input=[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrderContinueButton;
	
	@FindBy(xpath="//div=[@class='title']")
	private WebElement orderSuccessful;
	
	@FindBy(xpath="//input=[@value'Continue']")
	private WebElement confirmContinueButton;
	
	@FindBy(linkText="Log out")
	private WebElement logOutLink;
	
	
	
public Assignment3a(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}
public void clickOnApperalandshoesLink()
{
	apperalandshoesLink.click();
}


public void clickOnBlueJeansLink()
{
	blueJeansLink.click();
}

public void clickOnAddToCart()
{
	addToCartButton.click();
}

public void clickOnShoppingCart()
{
	shoppingCartLink.click();
}

public void countryDropdown(String countryId)
{
    s1=new Select(countryIdDrpdown);
	s1.selectByVisibleText(countryId);
}

public void enterZipCode(String zipCode)
{
	zipCodeTextField.sendKeys(zipCode);
}

public void clickOnCheckBox()
{
	iAgreeCheckBox.click();
}
 
public void clickOnCheckoutButton()
{
	checkoutButton.click();
}

public void clickOnBillingContinueButton()
{
	billingContinueButton.click();
}

public void clickOnShippingContinueButton()
{
	shippingContinueButton.click();
}

public void clickOnGroundButton()
{
	groundButton.click();
}

public void clickOnShippingMethodButton()
{
	shippingMethodContinueButton.click();	
}

public void clickOnPaymentMethod()
{
	paymentMethodRadioButton.click();
}

public void clickOnPaymentMethodButton()
{
	paymentMethodContinueButton.click();
}

public void paymentInformation(String cardType)
{
	s1=new Select(typeOfCreditCard);
	s1.selectByVisibleText(cardType);
}

public void cardHolderTextField(String cardHolderName)
{
	CardholderNameTextField.sendKeys(cardHolderName);
}

public void cardNumberTextField(String cardNumber)
{
	cardNumberTextField.sendKeys(cardNumber);
}

public void clickOnExpireMonth(String ExpireMonth)
{
	s1=new Select(expireMonthDropDown);
	s1.selectByVisibleText(ExpireMonth);
}

public void clickOnExpireYear(String ExpireYear)
{
	s1=new Select(expireYearDropDown);
	s1.selectByVisibleText(ExpireYear);
}

public void cardCodeTextField(String cardCode)
{
	cardCodeNumber.sendKeys(cardCode);

}

public void paymentInfoButton()
{
	paymentInfoContinueButton.click();	
}

public void confirmOrderButton()
{
	confirmOrderContinueButton.click();
}

public String getOrderSucessful()
{
	 return orderSuccessful.getText();
	
}

public void confirmContinueButton()
{
	confirmContinueButton.click();
}

public void logOutButton()
{
	logOutLink.click();
}

public void closeTheWebShop()
{
	driver.close();
}

}
