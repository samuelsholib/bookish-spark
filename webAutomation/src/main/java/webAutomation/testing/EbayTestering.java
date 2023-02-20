package webAutomation.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayTestering {
	
	public static void main (String args[]) throws InterruptedException {
		
		WebDriver myDriver = new ChromeDriver();
		
		myDriver.get("http://www.ebay.com");
		myDriver.findElement(By.id(null));
		
		myDriver.manage().window().maximize();
		Thread.sleep(2000);
		
		myDriver.findElement(By.id("gh-gb")).sendKeys("iphone");
	}

}
