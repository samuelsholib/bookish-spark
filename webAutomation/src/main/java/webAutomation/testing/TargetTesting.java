package webAutomation.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver myDriver = new ChromeDriver();
		myDriver.get("http://www.target.com");
		
		myDriver.manage().window().maximize();
		Thread.sleep(2000);
		
		myDriver.findElement(By.name("google_ads_top_frame")).sendKeys("iphone");

	}

}
