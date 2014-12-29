package spom.project.initiate;

import org.openqa.selenium.firefox.FirefoxDriver;

import spom.base.core.BasePage;
import spom.base.core.CommonBase;

public class Initiate extends BasePage {

	public static <TPage extends CommonBase> TPage LoadApplication(TPage page,
			String url) {
		// Load Page
		Driver = new FirefoxDriver();

		return LoadPage(page, Driver, url);
	}
}
