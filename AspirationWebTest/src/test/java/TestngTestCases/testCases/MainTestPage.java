package TestngTestCases.testCases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.reporters.jq.Main;
import org.testng.annotations.Test;

public class MainTestPage {
	
	@BeforeClass
	public void beforetest() {
	
		String absolutePath = new File(Main.class.getClassLoader().getResource("chromedriver-76.0.3809.68.exe").getFile()).getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", absolutePath);
		
	}
	@Test
	public void testAspiration() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aspiration.com/");
		WebElement productsList =
		driver.findElement(By.xpath("//section[@class = \"Flex-sc-1kj10zc-0 InfoSection__Section-sc-17h2ux1-0 kSBPgK cVWsBi content-section\"]"));
		
	
	}

}
