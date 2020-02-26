package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class businessLogics {


 public  WebDriver driver;
@Given("user is on facebook login page")
public void user_is_on_facebook_login_page() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\elcot\\eclipse-workspace\\Senthil\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");  
}

@When("user enter {string} and {string}")
public void user_enter_and(String s1, String s2) {
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys(s1);

	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys(s2);

}

@Then("To check the functionality")
public void to_check_the_functionality() {
	driver.quit();    
}
}