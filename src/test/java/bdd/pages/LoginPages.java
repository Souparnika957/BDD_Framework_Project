package bdd.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPages {
    WebDriver driver;
	
    By buttonField = By.xpath("//a[text()=' Signup / Login']");
    By usernameField = By.xpath("//input[@data-qa=\"login-email\"]");
    By passwordField = By.xpath("//input[@data-qa=\"login-password\"]");
    By LoginButton = By.xpath("//button[@data-qa='login-button']");
    By error_msg = By.xpath("//p[text()='Your email or password is incorrect!']");
	
    public LoginPages(WebDriver driver) {
    	this.driver = driver;
    	
    }
    
    public void LoginButton() {
    	driver.findElement(buttonField).click();
    }
    
    public void enterUser_Password(String username, String password) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
    	element1.sendKeys(username);
    	
    	WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
    	element2.sendKeys(password);
    }
    

    public void LoginClick() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(LoginButton)).click();
        }   	
    
    public void homeTitle() {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Automation"));
        } 
    
    
    public void getErrorMessage(String message) {
    	String actual_error_msg = driver.findElement(error_msg).getText();
    	System.out.println("Actual Error msg is:" + actual_error_msg);
    	Assert.assertEquals(actual_error_msg, message);

    }
    
    
    
}
