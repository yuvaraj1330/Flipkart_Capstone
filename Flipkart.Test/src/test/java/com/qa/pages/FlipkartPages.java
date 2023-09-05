package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPages {
	WebDriver driver;
	@FindBy(xpath="//button[contains(text(),'✕')]")
	WebElement cross;
	public WebElement getCross() {
		return cross;
	}

	@FindBy(xpath="(//div[@class='_2Sn47c'])[1]")
	WebElement logo;
	public WebElement getLogo() {
		return logo;
	}
	@FindBy(name="q")
	WebElement searchfield;
	public WebElement getSearchfield() {
		return searchfield;
	}
	
	
	
	@FindAll(@FindBy(xpath="//div[@class='_4rR01T']"))
	List<WebElement> searchitems;
	public List<WebElement> getSearchItems() {
		return searchitems;
	}
	
	

	
	public FlipkartPages(WebDriver rDriver) {
		this.driver= rDriver;
		PageFactory.initElements(rDriver, this);
	}
}

