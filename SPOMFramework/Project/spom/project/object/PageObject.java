package spom.project.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import spom.base.core.BasePage;

public class PageObject extends BasePage {

	@FindBy(name = "q")
	public WebElement txtSearch;

	@FindBy(name = "btnG")
	public WebElement btnSearch;

	public PageObject Search(String searchterm) {
		txtSearch.sendKeys(searchterm);
		btnSearch.click();
		return GetInstance(this, Driver, BaseURL);
	}
}
