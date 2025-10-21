package bdd.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseAllPage {
	
	public static WebDriver driver;
	
	@Before
	public void initializeBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	
	@After
	public void tearDownBrowser(Scenario scenario) {
		  if (scenario.isFailed()) {
		        final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		        scenario.attach(screenshot, "bdd/target/screenshot", "Failure Screenshot");
		    }
		driver.quit();
	}

	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

}
