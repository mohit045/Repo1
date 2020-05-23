package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.LandingPage;
import pageObjects.ProductListingPage;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homepage;
	private LandingPage landingpage;
	 private ProductListingPage productListingPage;
	 private CartPage cartPage;
	 private CheckOutPage checkoutPage;
	 //private ConfirmationPage confirmationPage;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public HomePage getHomePage() {
	return (homepage ==null) ?homepage = new HomePage(driver) : homepage;
	}
	
	public LandingPage getlandingpage() {
		return (landingpage==null) ? landingpage = new LandingPage(driver):landingpage;
	}
	
	public ProductListingPage getProductListPage() {
		return (productListingPage==null) ? productListingPage = new ProductListingPage(driver):productListingPage;
	}
	
	public CartPage getCartPage() {
		return (cartPage==null) ? cartPage = new CartPage(driver):cartPage;
	}
	
	public CheckOutPage getcheckoutPage() {
		return (checkoutPage==null) ? checkoutPage = new CheckOutPage(driver):checkoutPage;
	}

}

	
	