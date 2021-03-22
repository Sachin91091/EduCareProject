package school.educare.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import school.educare.base.TestBase;
import school.educare.pageobjects.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	
	public HomePageTest()
	{
	super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homePage= new HomePage(); 
		
	}
	
	@Test(priority = 1)
	public void homePageTitleTest()
	{
		String title=homePage.validateHomePageTitle();
		Assert.assertEquals(title, "NGO Internship - EduCARE India | Go Overseas");
	}
	
	
	@Test(priority = 2)
	
	public void programsLinkTest()
	{
		homePage.validateProgramsLink();;
	}
	
	@Test(priority = 6)
	public void aboutUsLinkTest()
	{
		homePage.validateAboutUsLink();
	}
	@Test(priority = 4)
	public void jobLinkTest()
	{
		homePage.validateJobLink();
	}
	
	@Test(priority = 3)
	public void onlineProgramsLinkTest()
	{
		homePage.validateProgramsLink();
	}
	@Test(priority = 5)
	public void communityProgramsLink()
	{
		homePage.validateCommunityProgramsLink();
	}

	@AfterMethod
	
	public void tearDown()
	{
		driver.close();
	}

}
