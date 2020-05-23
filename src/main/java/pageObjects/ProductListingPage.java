package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {
	
	public ProductListingPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 }
		 
		 @FindBy(css = "button.single_add_to_cart_button") 
		 private WebElement btn_AddToCart;
		 
		 @FindAll(@FindBy(css= ".noo-product-inner"))
		 private List<WebElement> prd_List; 
		 
		 
		 
		 @FindBy(css = "#pa_color") 
		 private WebElement btn_Color;
		 
		 @FindBy(xpath = "//option[@value='white']") 
		 private WebElement lbl_white;
		 
		 @FindBy(css = "#pa_size") 
		 private WebElement btn_Size;
		 
		 @FindBy(xpath = "//option[@value='medium']") 
		 private WebElement lbl_medium;
		 
		 
		 
		 public void clickOn_AddToCart() {
		 btn_AddToCart.click();
		 }
		 
		 public void select_Product(int productNumber) {
		 prd_List.get(productNumber).click();
		 }
		 
		 public void clickOn_Color() {
			 btn_Color.click();
			 }
		 
		 
		 public void select_color() {
			 lbl_white.click();
			 }
		 
		 
		 
		 public void clickOn_Size() {
			 btn_Size.click();
			 }
		 
		 
		 public void select_size() {
			 lbl_medium.click();
			 }
	
	
}
