package school.educare.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import school.educare.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(linkText = "Home")

	WebElement homeLink;

	@FindBy(xpath = "//span[text()='Programs Abroad']")

	WebElement programsLink;

	@FindBy(xpath = "//span[text()='About Us']")

	WebElement aboutUsLink;

	@FindBy(xpath = "//span[text()='Jobs']")

	WebElement jobLink;

	@FindBy(xpath = "//span[text()='Online Programs']")

	WebElement onlineProgramsLink;

	@FindBy(xpath = "//span[text()='Community']")

	WebElement communityLink;

	@FindBy(xpath = "//button[@class='btn btn-danger']")

	WebElement loginButton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	

	public void validateProgramsLink()

	{
		programsLink.click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
	}

	public void validateAboutUsLink()

	{
		aboutUsLink.click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
	}

	public void validateJobLink()

	{
		jobLink.click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
	}

	public void validateOnlineProgramsLink()

	{
		onlineProgramsLink.click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
	}
	
	public void validateCommunityProgramsLink()
	{
		communityLink.click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
	}

}
