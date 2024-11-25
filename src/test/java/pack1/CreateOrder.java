package pack1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://demowebshop.tricentis.com/";

		// invoke the url
		driver.get(url);

		// open registration page
		driver.findElement(By.linkText("Register")).click();

		// select the gender
		driver.findElement(By.id("gender-male")).click();

		// fill firstname
		driver.findElement(By.id("FirstName")).sendKeys("Aniket");

		// fill lastname
		driver.findElement(By.id("LastName")).sendKeys("Annadate");

		// fill email id
		driver.findElement(By.id("Email")).sendKeys("aniket" + random() + "@gmail.com");
		
		//fill password
		driver.findElement(By.id("Password")).sendKeys("Pass@123");
		
		//fill confirm password
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Pass@123");
		
		//submit the form
		driver.findElement(By.id("register-button")).submit();
		
		

	}

	private static String random() {
		// TODO Auto-generated method stub
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyddmmss");
		String formattedDateTime = currentDateTime.format(formatter);
		System.out.println("Current Date and Time: " + formattedDateTime);
		return formattedDateTime;
		
	}

}
