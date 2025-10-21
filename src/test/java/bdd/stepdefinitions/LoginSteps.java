package bdd.stepdefinitions;

import org.openqa.selenium.WebDriver;

import bdd.base.BaseAllPage;
import bdd.pages.LoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps  {
	
	WebDriver driver = BaseAllPage.driver;
	LoginPages loginPages;
	
	@Given("User is on the Home Page")
	public void user_is_on_the_login_page() {
		loginPages = new LoginPages(driver);
	}
	
	@And("User clicks on Login Button")
	public void user_clicks() {
		loginPages.LoginButton();
	}
	
	@When("User enters username {string} and password {string}")
	public void enter_username_Password(String username, String password) {
		loginPages.enterUser_Password(username, password);
	}

	
	@And("User clicks on login button")
		public void button_click() {
		loginPages.LoginClick();
	}
	
	@Then("User Should see the home Page title")
        public void home_page_title() {
		loginPages.homeTitle();		
	}
	
	@Then("User should get error {string}")
	public void user_should_get_error(String message){
		loginPages.getErrorMessage(message);
	}
	
}


