package com.adactin.project.am.Pradeep_Adactin_Project_7am;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.project.adactin.BaseClass;

public class TestClass extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = browserLaunch("chrome");

		getUrl("https://adactinhotelapp.com/index.php");

		sleep("2000");
		
		// login Title
		WebElement title = driver.findElement(By.className("login_title"));
		isEnabled(title);
		getElementText(title, "Element Text is: ");

		// UserName
		WebElement username = driver.findElement(By.id("username"));
		userInput(username, "pradeep4");

		// password
		WebElement password = driver.findElement(By.id("password"));
		userInput(password, "pradeep");

		// login button
		WebElement loginbtn = driver.findElement(By.id("login"));
		isDisplayed(loginbtn);
		clickOnElement(loginbtn);
		
		//back & forward
		navigate("back");
		navigate("forward");
		
		//location
		WebElement location = driver.findElement(By.id("location"));
		isMultiple(location);
		getOption(location);
		select(location, "text", "London");
		sleep("1000");
		getAllSelected(location);
		
		//hotels
		WebElement hotel = driver.findElement(By.id("hotels"));
		select(hotel, "value", "4");
		
		
		//hotels
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		screenShot("C:\\Users\\prade\\eclipse-workspace 2\\Pradeep_Adactin_Project_7am\\ScreenShot\\Adactin.png");
		

		//Thread.sleep(2000);
		//driver.close();

	}
}
