package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.StartFreeTrailClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC03_StartFreeTrailStepClass extends BaseClass {

	@Given("User Should in the vybog free Trail webpage")
	public void userShouldInTheVybogFreeTrailWebpage() {
		try {
			getDriver("Chrome");
			windMax();
			getUrl("https://vybog.com/start-a-free-trial/");
			Thread.sleep(1000);

			System.out.println("Browser and Url Launched Successfull");
		} catch (Exception e) {
			System.out.println("Browser and Url Not Launched " + "Error :" + e.getMessage());
		}
	}

	@When("User Should Enter the Vybog Fullname")
	public void userShouldEnterTheVybogFullname() {

		try {
			StartFreeTrailClass a = new StartFreeTrailClass();

			WebElement fullName = a.getFullName();
			fullName.sendKeys("Test");
			Thread.sleep(1000);

			System.out.println("FullName Entered Successfull");
		} catch (Exception e) {
			System.out.println("FullName Entered Successfull " + "Error :" + e.getMessage());
		}
	}

	@When("User Should Enter the Bussiness Email")
	public void userShouldEnterTheBussinessEmail() {
		try {
			StartFreeTrailClass a = new StartFreeTrailClass();

			WebElement bussinessEmail = a.getBussinessEmail();
			bussinessEmail.sendKeys("Test@123.com");
			Thread.sleep(1000);

			System.out.println("bussinessType Entered Successfull");

		} catch (Exception e) {
			System.out.println("bussinessType Entered Successfull" + "Error :" + e.getMessage());
		}
	}

	@When("User Shoud Enter the CompanyName")
	public void userShoudEnterTheCompanyName() {
		try {
			StartFreeTrailClass a = new StartFreeTrailClass();
			
			WebElement companyName = a.getCompanyName();
			companyName.sendKeys("Vybog");
			Thread.sleep(1000);

			System.out.println("ComanyName Entered Successfull");
			
		} catch (Exception e) {
			System.out.println("ComanyName not Entered"+"Error :"+e.getMessage());
		}
	}

	@When("User Shoul Enter the Phone Number")
	public void userShoulEnterThePhoneNumber() {
		try {
			StartFreeTrailClass a = new StartFreeTrailClass();
			
			WebElement phoneNumber = a.getPhoneNumber();
			phoneNumber.sendKeys("1234567890");
			Thread.sleep(1000);
			
			System.out.println("PhoneNumber Entered Successfull");

		} catch (Exception e) {
			System.out.println("PhoneNumber Not Entered "+"Error :"+e.getMessage());		
		}
	}

	@When("User Should Select the Country")
	public void userShouldSelectTheCountry() {
		try {
			StartFreeTrailClass a = new StartFreeTrailClass();
			
			WebElement country = a.getCountry();
			selectMethod(country, "India");
			Thread.sleep(1000);
			
			System.out.println("Country Selected Successfull");
			
		} catch (Exception e) {
			System.out.println("Country Selected Successfull"+"Error :"+e.getMessage());		
		}
	}

	@When("User Should Select the Bussiness Type")
	public void userShouldSelectTheBussinessType() {
		
		try {
			StartFreeTrailClass a = new StartFreeTrailClass();
			
			WebElement bssinessType = a.getBssinessType();
			bssinessType.sendKeys("Vybog Testing");
			Thread.sleep(1000);

			System.out.println("Bussiness Type Entered Successfull");
		} catch (Exception e) {
			System.out.println("Bussiness Type not Entered "+"Error :"+e.getMessage());
		}
	}

	@When("User Should Select The Services")
	public void userShouldSelectTheServices() {
		try {
			StartFreeTrailClass a = new StartFreeTrailClass();
			
			WebElement services = a.getServices();
			selectMethod(services, "ATS");
			Thread.sleep(1000);

			System.out.println("Services Selected Successfull");
		} catch (Exception e) {
			System.out.println("Services not Selected "+"Error :"+e.getMessage());	
		}
	}

	@When("User Should Select the Team Sizes")
	public void userShouldSelectTheTeamSizes() {
		try {
			StartFreeTrailClass a = new StartFreeTrailClass();
			WebElement team = a.getTeam();
			selectMethod(team, "5-10");
			Thread.sleep(1000);
			
			System.out.println("Team Size Entered Successfull");

		} catch (Exception e) {
			System.out.println("Team Size Not Entered ");
		}
	}

	@Then("User Shoul Verify the Successfull Message")
	public void userShoulVerifyTheSuccessfullMessage() {
		System.out.println("User Shoul Verify the Successfull Message");
	}
}
