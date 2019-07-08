package vn.amabuy.steps;
import net.thucydides.core.annotations.Step;
import vn.amabuy.pages.*;

public class LoginSteps{
	LoginPage onLoginPage = new LoginPage();
	@Step
	public void enter_email_or_phonenumber(String emailOrPhoneNumber) {
		
		onLoginPage.enterEmailOrPhoneNumber(emailOrPhoneNumber);
	}
	
	@Step
	public void enter_password(String passWord) {
		onLoginPage.enterPassword(passWord);
	}
	
	@Step
	public void click_remember_on_checkbox() {
		onLoginPage.clickRememberCheckbox();
	}
	
	@Step
	public void click_btn_login() {
		onLoginPage.clickButtonLogin();
	}

	
	@Step
	
	public void enter_on_brower(String emailOrPhoneNumber, String password) {
		enter_email_or_phonenumber(emailOrPhoneNumber);
		enter_password(password);
		click_btn_login();
	}
}
