package applicationActions;

import com.automation.base.CustomException;
import com.pageObjects.AccountPage;
import com.pageObjects.LoginPage;

/**
 * This class will contains all the admin functions
 * 
 * @author bharatp
 *
 */
public class LoginActions {

	/**
	 * Login as Super Admin
	 * 
	 * @param userName
	 * @param password
	 * @throws CustomException
	 */
	public void loginInLRSApplication(String userName, String password) throws CustomException {
		LoginPage.loginuserName.setText(userName);
		LoginPage.loginPassword.setText(password);
		LoginPage.loginButton.performClickAction();
		LoginPage.loggedInUserName.performClickAction();
		LoginPage.profileOption.performClickAction();
		LoginPage.accountRoleName.isElementDisplayed();
	}
}
