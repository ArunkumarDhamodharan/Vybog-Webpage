package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BaseClass {
	public ContactUsPage() {
        PageFactory.initElements(driver,this);      
	}
	@FindBy(name="FirstName")
	private WebElement fullName;
	
	public WebElement getFullName() {
		return fullName;
	}
	@FindBy(name="PhoneNumber")
	private WebElement PhoneNumber;
	
	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}
	@FindBy(name="Email")
	private WebElement emailId;
	
	public WebElement getEmailId() {
		return emailId;
	}
	@FindBy(name="Message")
	private WebElement writeUs;
	
	public WebElement getWriteUs() {
		return writeUs;
	}
	
}
	
