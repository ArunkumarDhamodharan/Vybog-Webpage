package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinUsClass extends BaseClass {
	public JoinUsClass() {
        PageFactory.initElements(driver,this);
        
	}
	@FindBy(name="FirstName")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	@FindBy(name="LastName")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	@FindBy(name="Email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	@FindBy(name="ContactNumber")
	private WebElement contactNumber;
	
	public WebElement getContactNumber() {
		return contactNumber;
	}
	@FindBy(name="ChooseFile")
	private WebElement chooseFile;
	
	public WebElement getChooseFile() {
		return chooseFile;
	}
	@FindBy(name="Message")
	private WebElement message;
	
	public WebElement getMessage() {
		return message;
	}
}
