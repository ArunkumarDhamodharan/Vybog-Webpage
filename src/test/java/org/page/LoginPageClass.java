package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass extends BaseClass {
	public LoginPageClass() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="user_login")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}
	@FindBy(id="user_pass")
	private WebElement passWord;
	
	public WebElement getPassWord() {
		return passWord;
	}
	@FindBy(xpath = "//span[@class='dashicons dashicons-visibility']")
	private WebElement eyeButton;
	
	public WebElement getEyeButton() {
		return eyeButton;
	}
	@FindBy(id="rememberme")
	private WebElement rememberMeCheckBox;
	
	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}
	@FindBy(id="wp-submit")
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	@FindBy(how=How.XPATH,using="//a[@class='wp-login-lost-password']")
	private WebElement lostYourPass;
	
	public WebElement getLostYourPass() {
		return lostYourPass;
	}
	@FindBy(xpath = "//a[text()='← Go to vybog']")
	private WebElement gotoVybog;
	
	public WebElement getGotoVybog() {
		return gotoVybog;
	}
	@FindBy(how=How.XPATH,using="//a[text()='Powered by WordPress']")
	private WebElement vybogLogo;
	
	public WebElement getVybogLogo() {
		return vybogLogo;
	}
}
