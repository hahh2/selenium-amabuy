package vn.amabuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

	
		// Getter and Setter for User Name
	@FindBy(xpath = "//input[@placeholder='Email hoặc số điện thoại']")
	public WebElement userId;
	
	public void enterEmailOrPhoneNumber(String keyword) {
		userId.sendKeys(keyword);
	}
	public String getPlaceholderOfUserId() {
		return userId.getAttribute("placeholder");

	}
	public String getClassOfUserId() {
		return userId.getAttribute("class");
	}
	public String getTypeOfUserId() {
		return userId.getAttribute("type");
	}

		// Setter and Getter for Password
	@FindBy(xpath = "//input[@placeholder = 'Mật khẩu']")
	public WebElement passWordId;

	public void enterPassword(String keyword) {
		passWordId.sendKeys(keyword);
	}

	public String getTypeOfPasswordId() {
		return passWordId.getAttribute("type");
	}

	public String getPlaceholderOfPasswordId() {
		return passWordId.getAttribute("placeholder");
	}

	public String getClassOfPassWordId() {
		return passWordId.getAttribute("class");
	}

		// <input type="checkbox" class="form-check-input">
	@FindBy(xpath = "//input[@class = 'form-check-input']")
	WebElement rememberOnBrower;

	public void clickRememberCheckbox() {
		rememberOnBrower.click();
	}

	public String getTypeOfRemeberOnBrower() {
		return rememberOnBrower.getAttribute("type");
	}
	public String getClassOfRememberOnBrower() {
		return rememberOnBrower.getAttribute("class");
	}
	
		//<button class="btn btn-login">Đăng nhập</button>
	@FindBy(xpath = "//button[@class contains 'btn btn-login']")
	WebElement btnLogin;
	
	public void clickButtonLogin() {
		btnLogin.click();
	}
		public String getClassButtonLogin() {
		return btnLogin.getAttribute("class");
	}
}
