package com.adaction.stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.adactin.runner.RunnerClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver = RunnerClass.driver;

@Given("^user Going To The Login Page With Url$")
public void user_Going_To_The_Login_Page_With_Url() {
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^user Enters The Username In Username Box$")
public void user_Enters_The_Username_In_Username_Box() {
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("pradeep4");
}

@When("^user Enters The Password In Password Box$")
public void user_Enters_The_Password_In_Password_Box() {
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("pradeep");
}

@Then("^user Clicks The Login Button And Navigate To Hotel Searching Page$")
public void user_Clicks_The_Login_Button_And_Navigate_To_Hotel_Searching_Page() throws InterruptedException {
	WebElement loginbtn = driver.findElement(By.id("login"));
	loginbtn.click();
	Thread.sleep(2000);
}
	
}
