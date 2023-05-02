package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	

    String userName = "demo@techfios.com";
    String password = "abc123";
    String fullName = "Siru Pokharel";
    String company = "Techfios";
    String email = "pokharelsiru89@gmail.com";
    String phone = "123456789";
    String country = "Afghanistan";
    
	@Test
	public void userShouldBeAbleToAddCustomer() {
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login(userName, password);
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		dashboardPage.clickOnCustomerMenuElement();
		dashboardPage.clickOnAddCustomerMenuElement();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.validateAddCustomerPage();
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.selectCompanyName(company);
		addCustomerPage.insertEmail(email);
		addCustomerPage.insertPhoneNum(phone);
		addCustomerPage.selectCountryName(country);
		
		
	}
	
	
	
	
	
}
