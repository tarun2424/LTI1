package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverExample {

	public static void main(String[] args) {

	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();*/
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://blazedemo.com");
	}

}
