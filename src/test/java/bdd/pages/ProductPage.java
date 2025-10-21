package bdd.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductPage {
	
	WebDriver driver;
	
	By prod_click= By.xpath("//a[text()=' Products']");
	By prod_search = By.xpath("//input[@id='search_product']");
	By prod_search_click = By.xpath("//button[@id='submit_search']");
	By no_of_searchedProds = By.xpath("//div[@class=\"productinfo text-center\"]");
	
	
    
	public ProductPage(WebDriver driver) {
	        this.driver = driver;
    }
	
	public void product_click() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement prodBox  = wait.until(ExpectedConditions.visibilityOfElementLocated(prod_click));
		prodBox.click();
	}
	
	public void  product_title() {
		String actual_title = driver.getTitle();
		Assert.assertTrue(actual_title.contains("All Products"), "Product Page title mismatch");
	}
	
	public void product_search(String keyword) {
		System.out.println("Searching for product: " + keyword);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(prod_search));
		searchBox.clear();
		searchBox.sendKeys(keyword);
	}
	
	public void search_click() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(prod_search_click)).click();
	}
	
	public int searchedProducts() {
		List<WebElement> list = driver.findElements(no_of_searchedProds);
		return list.size();
	}
	
}


