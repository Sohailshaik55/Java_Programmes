package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxisBank {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "‪D:\\Selenium Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		

	}

}
