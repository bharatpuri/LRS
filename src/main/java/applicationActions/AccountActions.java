package applicationActions;

import com.automation.base.CustomException;
import com.pageObjects.AccountPage;
import com.selenium.common.SeleniumCommon;

/**
 * Class will contains all the actions of account page
 * 
 * @author bharatp
 *
 */
public class AccountActions {

	/** Navigate to the Home Page
	 * @throws CustomException
	 */
	public void nevigateToHomePage() throws CustomException {
		AccountPage.accountTab.mouseHover();
		AccountPage.accountTab.performClickAction();
		AccountPage.viewAllAccounts.performClickAction();
		AccountPage.accountOverViewOption.isElementDisplayed();
		
	}
	// Verify Add Account and View all Accounts options
	public void verifyAccountOptions() throws CustomException {
		AccountPage.accountTab.mouseHover();
		AccountPage.accountTab.performClickAction();
		AccountPage.addAccount.isElementDisplayed();
		AccountPage.viewAllAccounts.isElementDisplayed();
	}

	// Search and select the account
	public void searchAccountAndSelect() throws CustomException {
		AccountPage.accountTab.mouseHover();
		AccountPage.accountTab.performClickAction();
		AccountPage.viewAllAccounts.performClickAction();
		SeleniumCommon.waitForSeconds(3);
		AccountPage.searchBoxOnAccountsPage.isElementDisplayed();
		SeleniumCommon.waitForSeconds(3);
		AccountPage.searchBoxOnAccountsPage.setText("anup.kulkarni@synerzip.com");
		SeleniumCommon.waitForSeconds(5);
		AccountPage.searchIcon.performClickAction();
		SeleniumCommon.waitForSeconds(2);
		AccountPage.firstAccount.mouseHover();
		AccountPage.firstAccount.performClickAction();

	}

	public void verifyAccountPage() throws CustomException {
		AccountPage.accountList.isElementDisplayed();
		AccountPage.searchBoxOnAccountsPage.isElementDisplayed();
		AccountPage.firstAccount.isElementSelected();
		AccountPage.accountDetailsOption.isElementDisplayed();
		AccountPage.accountNameTextBox.isElementDisplayed();
		AccountPage.resentActivationEmailLink.isElementDisplayed();
		AccountPage.changeAccountOwnerLink.isElementDisplayed();
	}

	public void editOneCuePlan() throws CustomException {
		AccountPage.oneCuePlanDropDwon.mouseHover();
		AccountPage.oneCuePlanDropDwon.performClickAction();
//		AccountPage.oneCueBasicPlan.mouseHover();
		AccountPage.oneCueBasicPlan.performClickAction();
		//AccountPage.oneCuePlanDropDwon.selectByVisibleText(plan);
//		AccountPage.oneCueLocationTexBox.clearTextBox();
//		AccountPage.oneCueLocationTexBox.setText(location);
//		AccountPage.accountSaveButton.performClickAction();

		
	}

}
