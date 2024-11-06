package com.comcast.crm.objectRepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	WebDriver driver;
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Products")
	private WebElement ProductsLink;
	public WebElement getProductsLink()
	{
		return ProductsLink;
	}
	@FindBy(linkText = "Productsdropdown")
	private WebElement ProductsddLink;
	
	public WebElement getProductsddLink()
	{
		return ProductsddLink;
	}
	@FindBy(linkText = "srch123")
	private WebElement ProductsddLink;
	
	public WebElement getProductsddLink()
	{
		return ProductsddLink;
	}

}
