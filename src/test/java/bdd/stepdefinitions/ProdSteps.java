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
	@Given("User is on the product page")
	public void navigates() {
		productpages.product_click();
	}
	
	   
	@And("User search for the {string}")
	@When("User searches for the {string}")
    public void search(String product) {
	//	System.out.println("Searching for product: " + product);
		productpages.product_search(product);
	}
	   
	@When("User submits the search")
	@And("User submits the product")
	public void searchclick() {
		productpages.search_click();
	}
	
	@Then("the number of images displayed should be retrieved")
	public void num_of_products() {
		int a = productpages.searchedProducts();	
		System.out.println("Number of Products:" + a);
	}
	
	@And("User clicks on {string} for the last product")
	public void view_Prod(String viewProduct) {
		productpages.viewProducts();
	}
	
	@Then("the product details {string}, {string} and {string} and {int} should be verified.")
	public void Product_details(String avail, String condi, String brand, int price) {
		productpages.viewProdDetails(avail, condi, brand, String.valueOf(price));

	}
	
}
