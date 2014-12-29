package spom.project.Test;

import spom.base.core.CommonBase;
import spom.project.initiate.Initiate;
import spom.project.object.PageObject;

public class PageTest extends CommonBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PageObject page = new PageObject();
		// Load Application
		CurrentPage = Initiate.LoadApplication(page, "http://www.google.com");

		// Search for selenium in search textbox
		CurrentPage.Page(page).Search("selenium");
	}
}
