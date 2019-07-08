package vn.amabuy.features;
import vn.amabuy.steps.LoginSteps;
public class WhenLoginSystemWithInvalidData {
	LoginSteps onLoginSteps;
	
	public void should_see_error_message_with_invalid_data() {
		onLoginSteps.tear_Up();
		onLoginSteps.user_login_system("seleniumvietnam@asksqa.com", "1234567");
		onLoginSteps.should_see_that_error_message_is("Thông tin đăng nhập không chính xác");
	}
}
