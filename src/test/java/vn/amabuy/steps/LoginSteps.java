package vn.amabuy.steps;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import vn.amabuy.pages.LoginPage;

public class LoginSteps{
	LoginPage onLoginPage;
	String baseUrl;
	EnvironmentVariables varEnvironmet = SystemEnvironmentVariables.createEnvironmentVariables();
	
	@Managed 
	WebDriver driver;
		
	@Before(value = "Start Project")
	public void tear_Up() {
		baseUrl = varEnvironmet.getProperty(ThucydidesSystemProperty.WEBDRIVER_BASE_URL);
		driver.get(baseUrl);
	}
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
	
	public void user_login_system(String emailOrPhoneNumber, String password) {
		enter_email_or_phonenumber(emailOrPhoneNumber);
		enter_password(password);
		click_btn_login();
	}
	
	@After(value = "Quit")
	public void teatDown() {
		driver.quit();
	}
}
