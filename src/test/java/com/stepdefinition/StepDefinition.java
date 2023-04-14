package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("User launch Adactinhotelapp in web apllication")
	public void user_launch_Adactinhotelapp_in_web_apllication() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(ops);
		driver.get("https://adactinhotelapp.com/");
	}

	@Then("User verify Login page is displayed")
	public void user_verify_Login_page_is_displayed() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		boolean text = currentUrl.contains("adactinhotelapp");
		System.out.println(text);
	}

	@When("User enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		driver.findElement(By.id("username")).sendKeys("PunithaAB");
		driver.findElement(By.id("password")).sendKeys("2JV79N");
	}

	@When("User click Login Button")
	public void user_click_Login_Button() {

	}

	@Then("User verify home page is displayed")
	public void user_verify_home_page_is_displayed() {

	}

	@When("User enter valid Location,Hotel,roomType,CheckIN,checkOUT,Number of adult,Number of childern")
	public void user_enter_valid_Location_Hotel_roomType_CheckIN_checkOUT_Number_of_adult_Number_of_childern() {

	}

	@When("User click Search Button")
	public void user_click_Search_Button() {

	}

	@Then("User verify SearchHotel page will be displayed")
	public void user_verify_SearchHotel_page_will_be_displayed() {

	}

	@When("User Select Radiobutton")
	public void user_Select_Radiobutton() {

	}

	@When("User Select Continue Button")
	public void user_Select_Continue_Button() {

	}

	@Then("User Verify BookingHotel page will be displayed")
	public void user_Verify_BookingHotel_page_will_be_displayed() {

	}

	@When("User Enter Correct FirstName,LastName,Address")
	public void user_Enter_Correct_FirstName_LastName_Address() {

	}

	@When("User Enter Valid Credit card Number,card type,Expiry Date, Month and Year, Valid CVV")
	public void user_Enter_Valid_Credit_card_Number_card_type_Expiry_Date_Month_and_Year_Valid_CVV() {

	}

	@When("User click Book Button")
	public void user_click_Book_Button() {

	}

	@Then("User Verify Order ID is displayed")
	public void user_Verify_Order_ID_is_displayed() {
	    
	}

	@When("User enter Invalid username and valid password")
	public void user_enter_Invalid_username_and_valid_password() {
	   
	}

	@Then("User Verify Error Message is dipalyed")
	public void user_Verify_Error_Message_is_dipalyed() {
	  
	}

	@When("User enter valid username and Invalid password")
	public void user_enter_valid_username_and_Invalid_password() {
	    
	}

	@When("User enter Invalid username and Invalid password")
	public void user_enter_Invalid_username_and_Invalid_password() {
	  
	}

	@Then("User Verify Error Message is displayed")
	public void user_Verify_Error_Message_is_displayed() {
	    
	}


}
