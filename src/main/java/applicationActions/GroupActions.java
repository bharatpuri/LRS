package applicationActions;

import com.automation.base.CustomException;
import com.pageObjects.GroupPage;

/**
 * Class will contains all the group page actions
 * 
 * @author bharatp
 *
 */
public class GroupActions {

	/**
	 * Verify Add Group and View All Groups options
	 * 
	 * @throws CustomException
	 */
	public void verifyGroupsOptions() throws CustomException {
		GroupPage.groupTab.performClickAction();
		GroupPage.addNewGroup.isElementDisplayed();
		GroupPage.viewAllGroups.isElementDisplayed();
	}

	/**
	 * Navigate to the Add group page
	 * 
	 * @throws CustomException
	 */
	public void nevigateToAddGroupPage() throws CustomException {
		GroupPage.groupTab.performClickAction();
		GroupPage.addNewGroup.performClickAction();
		GroupPage.newGroupLabel.isElementDisplayed();
		//SeleniumCommon.waitForSeconds(2);
	}

	/**
	 * Navigate to View Group page
	 * 
	 * @throws CustomException
	 */
	public void nevigateToViewAllGroupsPage() throws CustomException {
		GroupPage.groupTab.mouseHover();
		GroupPage.groupTab.performClickAction();
		GroupPage.viewAllGroups.performClickAction();
		GroupPage.groupDetailLalelOnViewGroupsPage.isElementDisplayed();
		//SeleniumCommon.waitForSeconds(2);
	}

	// Verify Add group page
	// Add group
	// Verify All group page
	//

}
