package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demowebshop.tricentis.com/";
		driver.get(url);
		
		System.out.println(" website invoked ");
		
		

	}

}
