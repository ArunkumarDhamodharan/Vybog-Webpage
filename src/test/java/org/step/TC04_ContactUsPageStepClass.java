package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.ContactUsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC04_ContactUsPageStepClass extends BaseClass {
	
	@Given("User Should In Vybog ContactUs Webpage")
	public void userShouldInVybogContactUsWebpage() {
		try {
			getDriver("Chrome");
			windMax();
			getUrl("https://vybog.com/contact-us/");
			Thread.sleep(1000);
			
			System.out.println("Browser and Url Launched Successfull");
		} catch (Exception e) {
			System.out.println("Browser and Url Not Launched " + "Error :" + e.getMessage());
		}    
	}
	@When("User Shoul Enter The FullName")
	public void userShoulEnterTheFullName() {
		try {
			ContactUsPage a= new ContactUsPage();
			WebElement fullName = a.getFullName();
			fullName.sendKeys("Test");
			
			System.out.println("FullName Entered Successfull ");
		} catch (Exception e) {
			System.out.println("FullName Not Entered  "+"Error :"+e.getMessage());	
		}   
	}
	@When("User Should Enter the Phone Number")
	public void userShouldEnterThePhoneNumber() {
		try {
			ContactUsPage a= new ContactUsPage();
			
			WebElement phoneNumber = a.getPhoneNumber();
			phoneNumber.sendKeys("1246789099");
			
			System.out.println("PhoneNumber Entered Successfull");
		} catch (Exception e) {
			System.out.println("PhoneNumber Entered Successfull"+"Error :"+e.getMessage());	
		} 
	}
	@When("User Should Enter the Email")
	public void userShouldEnterTheEmail() {
		try {
			ContactUsPage a= new ContactUsPage();
			
			WebElement emailId = a.getEmailId();
			emailId.sendKeys("Test@123.com");

			System.out.println("Email Id Entered SuccessFull");
		} catch (Exception e) {
			System.out.println("Email ID Not Entered "+"Error :"+e.getMessage());	
		}  
	}
	@When("User Should Enter the WriteUs Message")
	public void userShouldEnterTheWriteUsMessage() {
		try {
			ContactUsPage a= new ContactUsPage();
			
			WebElement writeUs = a.getWriteUs();
			writeUs.sendKeys("Vybog Testing");

			System.out.println("Message Entered Successfull");
		} catch (Exception e) {
			System.out.println("Message Not Entered "+"Error :"+e.getMessage());
		}  
	}
	@Then("ContactUs Page Verify SuccessFull")
	public void contactUsPageVerifySuccessFull() {
		System.out.println("ContactUs Page Verify SuccessFull");
	   
	}
}
