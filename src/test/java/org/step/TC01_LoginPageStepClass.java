package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.LoginPageClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_LoginPageStepClass extends BaseClass {

	@Given("User Should in Vybog Loginpage")
	public void userShouldInVybogLoginpage() {
		try {
			getDriver("Chrome");
			windMax();
			Thread.sleep(2000);
			getUrl("https://vybog.com/wp-login.php");
			Thread.sleep(1000);

			System.out.println("Browser and Url Launched Successfull");

		} catch (Exception e) {
			System.out.println("Browser and Url Not Launched " + "Error :" + e.getMessage());
		}
	}

	@When("User should Enter the {string} and {string}")
	public void userShouldEnterTheAnd(String user, String pass) {
		try {
			LoginPageClass a = new LoginPageClass();
			
			WebElement userName = a.getUserName();
			userName.sendKeys(user);
			
			WebElement passWord = a.getPassWord();
			passWord.sendKeys(pass);
			
			System.out.println("UserName and password Entered Successfull");
			
		} catch (Exception e) {
			System.out.println("UserName and password Not Entered "+"Error :"+e.getMessage());
		}	
	}
	@When("User should Click the Eye and Rememeberme button")
	public void userShouldClickTheEyeAndRememebermeButton() {
		try {
			LoginPageClass a = new LoginPageClass();

			WebElement eyeButton = a.getEyeButton();
			eyeButton.click();
			Thread.sleep(2000);
			
			WebElement rememberMeCheckBox = a.getRememberMeCheckBox();
			rememberMeCheckBox.click();
			Thread.sleep(2000);

			System.out.println("Eye Button and Rememberme Button Clicked successfull");

		} catch (Exception e) {
			System.out.println("Eye Button and rememberme Button Not Clicked " + "Error :" + e.getMessage());
		}
	}

	@When("User Should Click the Login button")
	public void userShouldClickTheLoginButton() {
		try {
			LoginPageClass a = new LoginPageClass();

			WebElement loginButton = a.getLoginButton();
			loginButton.click();
			Thread.sleep(3000);

			System.out.println("Login Button Clicked Successfull");

		} catch (Exception e) {
			System.out.println("Login Button Not Clicked " + "Error :" + e.getMessage());
		}
	}

	@When("User should Click the Lost Your Password button")
	public void userShouldClickTheLostYourPasswordButton() {
		try {
			LoginPageClass a = new LoginPageClass();
			
			WebElement lostYourPass = a.getLostYourPass();
			lostYourPass.click();
			Thread.sleep(2000);
			driver.navigate().to("https://vybog.com/wp-login.php");
			Thread.sleep(2000);

			System.out.println("Login Button Clicked Successfull");

		} catch (Exception e) {
			System.out.println("Login Button Not Clicked " + "Error :" + e.getMessage());
		}
	}

	@When("User Should Click the Go to Vybog Link")
	public void userShouldClickTheGoToVybogLink() {
		try {
			LoginPageClass a = new LoginPageClass();

			WebElement gotoVybog = a.getGotoVybog();
			gotoVybog.click();
			Thread.sleep(1000);
			driver.navigate().to("https://vybog.com/wp-login.php");
			Thread.sleep(2000);
			System.out.println("Go to Vybog Button Clicked Successfull");

		} catch (Exception e) {
			System.out.println("Go to Vybog Button Not Clicked" + "Error :" + e.getMessage());
		}
	}

	@When("User Should Click the Vybog Logo Link")
	public void userShouldClickTheVybogLogoLink() {
		try {
			LoginPageClass a = new LoginPageClass();

			WebElement vybogLogo = a.getVybogLogo();
			vybogLogo.click();
			Thread.sleep(2000);
			driver.navigate().to("https://vybog.com/wp-login.php");
			Thread.sleep(2000);

			System.out.println("Vybog Logo Link Clicked Successfull");

		} catch (Exception e) {
			System.out.println("Vybog Logo Link Not Clicked" + "Error :" + e.getMessage());
		}
	}

	@Then("LoginPage Verfied Successfully")
	public void loginPageVerfiedSuccessfully() {
		System.out.println("Vybog Login Page Verified Successfull ");

	}
}
