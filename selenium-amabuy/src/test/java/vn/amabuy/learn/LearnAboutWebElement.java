package vn.amabuy.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.seleniumhq.jetty9.util.security.Password;

public class LearnAboutWebElement {
	@FindBy(xpath = "//input[@placeholder='Email hoặc số điện thoại']") public WebElement userId;

	 //<input type="text" placeholder="Email hoặc số điện thoại" class="form-control">
	 
	 // Điền ký tự vào
	 public void enterEmailOrPhoneNumber(String value) {
		 userId.sendKeys(value);
	 }
	 //Phương thức này sẽ trả lại giá trị của thuộc tính placeholder là Email hoặc số điện thoại
	 public String getPlaceholderOfUserId() {
		 return userId.getAttribute("placeholder");
		 
	 }
	 
	 public String getClassOfUserId() {
		 return userId.getAttribute("class");
	 }
	 
	 public String getTypeOfUserId(){
		 return userId.getAttribute("type");
	 }
	 
	// <input placeholder="Mật khẩu" type="password" class="form-control">
	 
	 @FindBy(xpath = "//input[@placeholder = 'Mật khẩu']") public WebElement passWordId;
	 
	 public void enterPassword(String value) {
		 passWordId.sendKeys(value);
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
	 
	 @FindBy(xpath = "//input[@class = 'form-check-input']") WebElement rememberOnBrower;
	 
	 public void clickRememberCheckbox() {
		 rememberOnBrower.click();
	 }
	 
	 public String getTypeOfRemeberOnBrower() {
		 return rememberOnBrower.getAttribute("type");
	 }
	 
	 public String getClassOfRememberOnBrower() {
		 return rememberOnBrower.getAttribute("class");
	 }
	 
	 
	 @FindBy(xpath = "//a[@href = '/forgot']") WebElement returnPassWord;
	 
	 @FindBy(xpath = "//button[@class = 'btn btn-login']") WebElement btnLogin;
	 
	 @FindBy(xpath = "//button[@class = 'btn btn-fb']") WebElement btnLonginFB;
	 
	 @FindBy(xpath = "//button[@class = 'btn btn-google']") WebElement btnLonginGG;
	 

		
	}
}
