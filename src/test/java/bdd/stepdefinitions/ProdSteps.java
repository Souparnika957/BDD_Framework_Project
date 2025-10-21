package bdd.stepdefinitions;

import org.openqa.selenium.WebDriver;

import bdd.base.BaseAllPage;
import bdd.pages.LoginPages;
import bdd.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProdSteps {

	
	WebDriver driver;
	LoginPages loginpages;
	ProductPage productpages;
	
	@Given("User Logged in with valid credentials username {string} and password {string}")
	public void home_page(String username, String password) {
	driver = BaseAllPage.getDriver();
	loginpages = new LoginPages(driver);
	loginpages.LoginButton();
	loginpages.enterUser_Password(username, password);
	loginpages.LoginClick();
	
	productpages = new ProductPage(driver);
	
	}
	
	
	@When("User click on product page")
	public void product_button() {
		productpages.product_click();
	}
	
	
	@Then("User should see the product page title")
	public void product_title() {
     	productpages.product_title();
	}
	
	@When("User navigates to the Product page")
	public void navigates() {
		productpages.product_click();
	}
	
	   
	@And("User search for the {string}")
    public void search(String product) {
	//	System.out.println("Searching for product: " + product);
		productpages.product_search(product);
		
	   }
	   
	@When("User submits the search")
	public void searchclick() {
		productpages.search_click();
	}
	
	@Then("Get the number of images displayed")
	public void num_of_products() {
		int a = productpages.searchedProducts();	
		System.out.println("Number of Products:" + a);
	}
}
