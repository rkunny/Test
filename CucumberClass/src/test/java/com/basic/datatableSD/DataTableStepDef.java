package com.basic.datatableSD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DataTableStepDef {
	
	
	WebDriver driver =null;
	
	@Before(order=1)
	public void beforeSetup1(){
		System.out.println("in before1");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Before(order=2)
	public void beforeSetup2(){
		System.out.println("in before2");
		
	}
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page(){
//		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Then("close browser")
	public void close_browser(){
		driver.quit();
		driver =null;
	}
	
	@When("Enter followind data")
	public void enter_followind_data(DataTable table) throws InterruptedException{
		
		List<List<String>> data = table.raw();
		
//		String values1 = data.get(0).get(0);
//		String values2 = data.get(0).get(1);
//		String values3 = data.get(0).get(2);
//		
		
		String values4 = data.get(1).get(0);
		String values5 = data.get(1).get(1);
		String values6 = data.get(1).get(2);

		driver.findElement(By.name("firstname")).sendKeys(values4);
		driver.findElement(By.name("lastname")).sendKeys(values5);
		driver.findElement(By.name("reg_email__")).sendKeys(values6);
		
		String values7 = data.get(2).get(0);
		String values8 = data.get(2).get(1);
		String values9 = data.get(2).get(2);
				
		driver.findElement(By.name("firstname")).sendKeys(values7);
		driver.findElement(By.name("lastname")).sendKeys(values8);
		driver.findElement(By.name("reg_email__")).sendKeys(values9);
		
		Thread.sleep(2000);
		
		
		
	}
	
	@After(order=2)
	public void tearDown1(){
		System.out.println("in After1");
		driver.quit();
		driver =null;
	}
	
	@After(order=1)
	public void tearDown2(){
		System.out.println("in After2");
		
	}	
}