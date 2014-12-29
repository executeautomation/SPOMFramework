package spom.base.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends CommonBase {

	public static BasePage CurrentPage;

	public static <TPage extends CommonBase> TPage GetInstance(TPage page,
			WebDriver driver, String Url) {
		// Set the values for Driver and Url
		page.Driver = driver;
		page.BaseURL = Url;

		// Initialize the page
		PageFactory.initElements(driver, page);

		// Wait for the page to fully load
		new WebDriverWait(driver, 10).until(ExpectedConditions
				.presenceOfElementLocated(By.tagName("body")));

		// return the page
		return page;
	}

	public <TPage> TPage Page(TPage page) {
		return (TPage) this;
	}

	public static <TPage extends CommonBase> TPage LoadPage(TPage page,
			WebDriver driver, String baseurl) {
		if (Driver == null)
			Driver = driver;
		Driver.navigate().to(baseurl);
		return GetInstance(page, driver, baseurl);
	}
}
