package pageObjects;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;

public class HomePage {
	
	
	WebDriver driver;
	
	ConfigFileReader configFileReader;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		try {
			configFileReader= new ConfigFileReader();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
//	public HomePage(WebDriver driver) {
//		 this.driver = driver;
//		 PageFactory.initElements(driver, this);
//		 }
		 
		 public void perform_Search(String search) {
		 driver.navigate().to("http://www.shop.demoqa.com?s="+search+"&post_type=product");
		 }
		 
		 public void navigateTo_HomePage() {
		 driver.get(configFileReader.getApplicationUrl());
		 }
	
	
	
	
	
	
	
	
	
}
