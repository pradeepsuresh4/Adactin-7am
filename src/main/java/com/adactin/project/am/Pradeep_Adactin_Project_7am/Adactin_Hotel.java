package com.adactin.project.am.Pradeep_Adactin_Project_7am;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {

	public static void main(String[] args) throws Exception {

		System.out.println("**** Pradeep Day 5-2 Task ****");
		// LaunchBrowser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prade\\eclipse-workspace 2\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");

		// username
		driver.findElement(By.id("username")).sendKeys("pradeepsuresh4");

		// password
		driver.findElement(By.id("password")).sendKeys("M5K4B6");

		// login
		driver.findElement(By.id("login")).click();

		// location
		WebElement location = driver.findElement(By.name("location"));
		Select s = new Select(location);
		s.selectByValue("London");

		// hotel
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(2);

		// room type
		WebElement room = driver.findElement(By.name("room_type"));
		Select s2 = new Select(room);
		s2.selectByValue("Double");

		// number of room
		WebElement roomnumber = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(roomnumber);
		s3.selectByValue("1");

		// In date
		driver.findElement(By.name("datepick_in")).clear();
		driver.findElement(By.name("datepick_in")).sendKeys("16/07/2022");

		// out date
		driver.findElement(By.name("datepick_out")).clear();
		driver.findElement(By.name("datepick_out")).sendKeys("17/07/2022");

		// Adult per room
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByValue("2");

		// child per room
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5 = new Select(child);
		s5.selectByValue("0");

		// search
		driver.findElement(By.id("Submit")).click();

		// hotel name
		driver.findElement(By.id("radiobutton_0")).click();

		// continue
		driver.findElement(By.id("continue")).click();

		// first name
		driver.findElement(By.name("first_name")).sendKeys("Pradeep");

		// last name
		driver.findElement(By.name("last_name")).sendKeys("Suresh");

		// address
		driver.findElement(By.name("address")).sendKeys("123, 4th Street , Chennai-78");

		// card number
		driver.findElement(By.id("cc_num")).sendKeys("1234 5678 9234 1845");

		// card type
		WebElement cardtype = driver.findElement(By.name("cc_type"));
		Select s6 = new Select(cardtype);
		s6.selectByVisibleText("Master Card");

		// month
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(month);
		s7.selectByVisibleText("February");

		// day
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByVisibleText("2022");

		// card cvv
		driver.findElement(By.id("cc_cvv")).sendKeys("123");

		// book now
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);

		// order id
		String id = driver.findElement(By.name("order_no")).getAttribute("value");
		System.out.println("My Order ID is" + id);

		// itinerary
		driver.findElement(By.name("my_itinerary")).click();

		// select all order
		driver.findElement(By.name("check_all")).click();

		// cancel all order
		driver.findElement(By.name("cancelall")).click();

		// accept alert
		driver.switchTo().alert().accept();

		// logout
		driver.findElement(By.name("logout")).click();

		// login
		driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
		Thread.sleep(2000);

		// Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\prade\\eclipse-workspace 2\\Selenium_Project\\Screenshot\\AdactinHotel.png");
		FileUtils.copyFile(sr, d);

		Thread.sleep(2000);
		driver.quit();

	}

}
