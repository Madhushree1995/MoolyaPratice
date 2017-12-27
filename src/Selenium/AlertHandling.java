package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

import Seleniumutility.SeleniumUtiltiy;

public class AlertHandling extends SeleniumUtiltiy{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementById("usernameId").sendKeys("Madhu");
		driver.findElementById("loginbutton").click();
		Alert alert = driver.switchTo().alert();
		
		
	}

}
