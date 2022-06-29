package com.visionit.automation.pageobjects;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class SearchPageObjects
{
	private static final Logger logger = LogManager.getLogger(CmnPageObjects.class);
	WebDriver driver;
	Scenario scn;
	
	public SearchPageObjects(WebDriver driver,Scenario scn) 
	{
		this.driver = driver;
		this.scn = scn;
	}
		
	//Locators
	private By ListofProductsElement = By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2/a");
	
	public void validateSearchPageTitle()
	{
		//Wait for titile
        WebDriverWait webDriverWait1 = new WebDriverWait(driver,20);
        logger.info("Waiting for page title:\"Amazon.in :Laptop\"");
        webDriverWait1.until(ExpectedConditions.titleIs("Amazon.in : Laptop"));
        //Assertion for Page Title
        Assert.assertEquals("Page Title validation","Amazon.in : Laptop", driver.getTitle()); 
        scn.log("Page title validation : "+ driver.getTitle());
        logger.info("Page title validation : "+ driver.getTitle());
	}
	
	public void clickOnFirstProd()
	{
		 List<WebElement> listOfProducts = driver.findElements(ListofProductsElement);
	        scn.log("Number of product searched: "+listOfProducts.size());
	        logger.info("Number of product searched: "+listOfProducts.size());
	        //But as this step asks click on any link, we can choose to click on Index 0 of the list
	        listOfProducts.get(0).click();
	        scn.log("Click on the first Link in the Link. Link text:" + listOfProducts.get(0).getText());
	        logger.info("Click on the first Link in the Link. Link text:" + listOfProducts.get(0).getText());
	}

}
