package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	
	public LandingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "#select2-drop ul li")
	 private List<WebElement> country_List; 
	
	@FindBy(id="dropdown")
	private WebElement dropdowncountry;
	
	
	
	public void selectCountry(String countryName) {
		dropdowncountry.click();
		for(WebElement country:country_List) {
			if(country.getText().equals(countryName)) {
				country.click();
				try { Thread.sleep(3000);}
				catch (InterruptedException e) {}
				break;
			}
		}
	}
	
}
