package vn.amabuy.features;
import vn.amabuy.steps.LoginSteps;
public class WhenLoginSystemWithInvalidData {
	LoginSteps onLoginSteps;
	
	public void sigin_system() {
		onLoginSteps.tear_Up();
		onLoginSteps.enter_email_or_phonenumber("hahh2@gmail.com");
		onLoginSteps.enter_password("123456");
		onLoginSteps.click_btn_login();
	}
}
