package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.JoinUsClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC02_JoinUsPageStepClass extends BaseClass {

	@Given("User Should in Vybog joinUspage")
	public void userShouldInVybogJoinUspage() {
		try {
			getDriver("Chrome");
			windMax();
			getUrl("https://vybog.com/join-us/");

			System.out.println("Browser and Url Launched Successfull");
		} catch (Exception e) {
			System.out.println("Browser and Url Not Launched " + "Error :" + e.getMessage());
		}
	}

	@When("User should Enter the FirstName and LastName")
	public void userShouldEnterTheFirstNameAndLastName() {
		try {
			JoinUsClass j = new JoinUsClass();

			WebElement firstName = j.getFirstName();
			firstName.sendKeys("Test");
			Thread.sleep(1000);

			WebElement lastName = j.getLastName();
			lastName.sendKeys("Test12");
			Thread.sleep(1000);

			System.out.println("Firstname and lastname Entered Successfull");
		} catch (Exception e) {
			System.out.println("Firstname and lastname Not Entered " + "Error :" + e.getMessage());
		}
	}

	@When("User Should Enterthe Email and ContactNumber")
	public void userShouldEntertheEmailAndContactNumber() {
		try {
			JoinUsClass j = new JoinUsClass();

			WebElement email = j.getEmail();
			email.sendKeys("test@123.com");
			Thread.sleep(1000);

			WebElement contactNumber = j.getContactNumber();
			contactNumber.sendKeys("1234567899");
			Thread.sleep(1000);

			System.out.println("Email and ContactNumber Entered Successfull");
		} catch (Exception e) {
			System.out.println("Email and ContactNumber Not Entered" + "Error :" + e.getMessage());
		}

	}

	@When("User Should Attach the Resume File")
	public void userShouldAttachTheResumeFile() {
		try {
			JoinUsClass j = new JoinUsClass();

			WebElement chooseFile = j.getChooseFile();
			chooseFile.sendKeys("C:\\Users\\Vy Systems\\Downloads\\blank.pdf");
			Thread.sleep(2000);

			System.out.println("File Attached Successful");

		} catch (Exception e) {
			System.out.println("File  Not Attached" + "Error :" + e.getMessage());
		}

	}

	@When("User Should Enter the Message")
	public void userShouldEnterTheMessage() {
		try {
			JoinUsClass j = new JoinUsClass();
            Thread.sleep(2000);
			WebElement message = j.getMessage();
			message.sendKeys("Vybog Testing");

			System.out.println("Meassage Entered Successful");
		} catch (Exception e) {
			System.out.println("Meassage Not Entered" + "Error :" + e.getMessage());
		}
	}

	@Then("JoinUs page verify Successfull")
	public void joinUsPageVerifySuccessfull() {
		System.out.println("JoinUs page verify Successfull");
	}
}
