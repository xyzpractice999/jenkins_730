package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSuite1 {

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		if(driver.getTitle().equals("Google")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		driver.quit();
	}

}
