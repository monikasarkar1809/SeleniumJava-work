package myclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclassdemo {

	public static <webElement> void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver File\\All driver folder\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.saucedemo.com/");
		
		//locate username by id
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//locate password by name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//locate login button by class
		driver.findElement(By.className("btn_action")).click();
		
		//Switch to product
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);

		WebElement elementlist = driver.findElement(By.linkText("Sauce"));
		System.out.println("Element size:"+  elementlist.getSize());
		

	}

}
