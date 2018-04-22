package com.basic.FirstFeatureFile;

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
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String uName){
		driver.findElement(By.name("firstname")).sendKeys(uName);		
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void User_checks_user_first_name_is_present(String name){
		String userNameActual = driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals(name, userNameActual);
	}

}
