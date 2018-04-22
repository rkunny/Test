package com.basic.DifferentFolder;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFirstStepDef1 {
	
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");	
		Thread.sleep(5000);
	}
	
	@When("^User enters user \"([^\"]*)\" first name and \"([^\"]*)\" as last name$")
	public void User_enters_user_first_name(String fName, String lName) throws InterruptedException{
		driver.findElement(By.name("firstname")).sendKeys(fName);
		driver.findElement(By.name("lastname")).sendKeys(lName);
		Thread.sleep(2000);
	}
	
	@Then("^User checks user \"([^\"]*)\" first name and \"([^\"]*)\" as last name are present$")
	public void user_checks_user_first_name_and_as_last_name_are_present(String frName, String laName) throws Throwable{
		String userFNameActual = driver.findElement(By.name("firstname")).getAttribute("value");
		String userLNameActual = driver.findElement(By.name("lastname")).getAttribute("value");
		Assert.assertEquals(frName, userFNameActual);
		Assert.assertEquals(laName, userLNameActual);
		Thread.sleep(1000);
	}

}
