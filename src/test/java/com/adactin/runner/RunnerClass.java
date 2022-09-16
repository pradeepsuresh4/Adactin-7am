package com.adactin.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\adaction\\feature\\adactin.feature" ,
		glue="com.adaction.stepdefinition",
		monochrome = true
		)

public class RunnerClass {
	
	public static WebDriver driver;
	
	//browser launch
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prade\\eclipse-workspace 2\\Pradeep_Adactin_Project_7am\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	//close
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	
	

}
