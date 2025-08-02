package project;

import org.openqa.selenium.chrome.ChromeDriver;


public class myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "C:\\Driver File\\All driver folder\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
