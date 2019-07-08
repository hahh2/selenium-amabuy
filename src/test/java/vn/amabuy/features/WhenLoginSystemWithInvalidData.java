package vn.amabuy.features;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.amabuy.steps.LoginSteps;


@RunWith(SerenityRunner.class)
public class WhenLoginSystemWithInvalidData {
	
	@Managed 
	WebDriver driver;
	
	@Steps
	LoginSteps loginSteps;
	
	@Test
	public void should_see_error_message_with_invalid_data() {
		loginSteps.visit_homepage();
		loginSteps.user_login_system("seleniumvietnam@asksqa.com", "1234567");
		loginSteps.should_see_that_error_message_is("Thông tin đăng nhập không chính xác");
	}
}
