package stepDefinitions;
 
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.LandingPage;
import pageObjects.ProductListingPage;


 
public class Steps{


 WebDriver driver;

 HomePage homepage;
 LandingPage landingpage;
 PageObjectManager pageObjectmanager;
 ConfigFileReader configFileReader;
 CheckOutPage checkoutPage;
ProductListingPage productListingPage;
ConfigFileReader configReader;
 
CartPage cartPage;
 
 @Given("^user is on Home Page$")
 public void user_is_on_Home_Page() throws FileNotFoundException{
	 configReader = new ConfigFileReader();
 System.setProperty("webdriver.chrome.driver",FileReaderManager.getInstance().getConfigReader().getDriverPath());
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 pageObjectmanager = new PageObjectManager(driver);
 homepage= pageObjectmanager.getHomePage();
driver.get("http://www.google.com");



//WebElementFacade element = $(By.id("Username"));


 }
 

@When("^he search for \"([^\"]*)\"$")
 public void he_search_for(String product) throws InterruptedException, FileNotFoundException  {
	 Thread.sleep(3000);
//homepage.perform_Search(product);
	 WebElement element = driver.findElement(By.name("q"));
	 element.sendKeys(product);
	 element.sendKeys(Keys.ENTER);
	 //driver.navigate().to("http://www.shop.demoqa.com?s="+product+"&post_type=product");
	 Thread.sleep(3000);
	 //Keys.ENTER()
 }
 
 @When("^choose to buy the first item$")
 public void choose_to_buy_the_first_item() throws InterruptedException {
 productListingPage= pageObjectmanager.getProductListPage();
 driver.navigate().refresh();
 Thread.sleep(5000);
 productListingPage.select_Product(4);
 productListingPage.clickOn_Color();
 productListingPage.select_color();
 productListingPage.clickOn_Size();
 productListingPage.select_size(); 
 productListingPage.clickOn_AddToCart(); 
 }
 
 @When("^moves to checkout from mini cart$")
 public void moves_to_checkout_from_mini_cart(){
 cartPage = pageObjectmanager.getCartPage();
 cartPage.clickOn_Cart();
 cartPage.clickOn_ContinueToCheckout(); 
 driver.quit();
 }
 
 @When("^enter personal details on checkout page$")
 public void enter_personal_details_on_checkout_page() throws InterruptedException {
 checkoutPage = pageObjectmanager.getcheckoutPage();
 checkoutPage.fill_PersonalDetails(); 
 }
 
 @When("^select same delivery address$")
 public void select_same_delivery_address() throws InterruptedException{
 checkoutPage.check_ShipToDifferentAddress(false);
 }
 
 @When("^select payment method as \"([^\"]*)\" payment$")
 public void select_payment_method_as_payment(String arg1){
 checkoutPage.select_PaymentMethod("CheckPayment");
 }
 
 @When("^place the order$")
 public void place_the_order() throws InterruptedException {
 checkoutPage.check_TermsAndCondition(true);
 checkoutPage.clickOn_PlaceOrder();
 
 driver.quit();
 } 

 
}