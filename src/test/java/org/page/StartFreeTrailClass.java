package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartFreeTrailClass extends BaseClass{
	
	public StartFreeTrailClass() {
        PageFactory.initElements(driver,this);      
	}
	@FindBy(name="Fullname")
	private WebElement fullName;
	
	public WebElement getFullName() {
		return fullName;
	}
	@FindBy(name="businessEmail")
	private WebElement bussinessEmail;
	
	public WebElement getBussinessEmail() {
		return bussinessEmail;
	}
	@FindBy(name="companyname")
	private WebElement companyName;
	
	public WebElement getCompanyName() {
		return companyName;
	}
	@FindBy(name="phone")
	private WebElement phoneNumber;
	
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	@FindBy(name="country")
	private WebElement country;
	
	public WebElement getCountry() {
		return country;
	}
	@FindBy(name="business-type")
	private WebElement bssinessType;
	
	public WebElement getBssinessType() {
		return bssinessType;
	}
	@FindBy(name="services")
	private WebElement services;
	
	public WebElement getServices() {
		return services;
	}
	@FindBy(name="team")
	private WebElement team;
	
	public WebElement getTeam() {
		return team;
	}
	
}
