package formhtmltest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.formpage;
import pages.Thankyoupage;

public class stepdefinitions {
	WebDriver driver;


	@Given("I am on the webpage")
	public void i_am_on_the_webpage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/ANKITHA/Desktop/web-html/web.html");



	}
	@When("I enter the  name")
	public void i_enter_the_name() {
		formpage page1 = new formpage(driver) ;
		page1.entername("skywalker");
	}



	@When("I enter the  address")
	public void i_enter_the_address() {
		formpage page1 = new formpage(driver) ;
		page1.enteraddress("Tatooine");

	}
	@When("I enter the story")
	public void i_enter_the_story() {
		formpage page1 = new formpage(driver) ;
		page1.enterstory("Jedi's tale");

	}
	@When("I click on the submit button")
	public void i_click_on_the_submit_button() {
		formpage page1 = new formpage(driver) ;
		page1.clickthesubmitbutton();

	}
	@Then("The next page should be displayed")
	public void the_next_page_should_be_displayed() {
		Thankyoupage page2 = new Thankyoupage(driver) ;
		if( page2.checkdisplaythankyou()) {
			System.out.println("The next page is displayed");
		}
		else {
			System.out.println("The next page is not displayed");
		}
	}




	@Then("Close the webpage")
	public void close_the_webpage() {
		driver.close();
	}


	@Then("I check the max length of name")
	public void i_check_the_max_length_of_name() {
		formpage page1 = new formpage(driver) ;
		page1.checknamemaxlength();
	}
	@Then("I check the max length of address")
	public void i_check_the_max_length_of_address() {
		formpage page1 = new formpage(driver) ;
		page1.checkaddressmaxlength();

	}
	@Then("I check the max length of story")
	public void i_check_the_max_length_of_story() {
		formpage page1 = new formpage(driver) ;
		page1.checkstorymaxlength();

	}


	@When("I enter the  name as {string}")
	public void i_enter_the_name_as(String string) {
		formpage page1 = new formpage(driver) ;
		page1.entername(string);

	}
	@When("I enter the  address as {string}")
	public void i_enter_the_address_as(String string) {
		formpage page1 = new formpage(driver) ;
		page1.enteraddress(string);

	}
	@When("I enter the story as {string}")
	public void i_enter_the_story_as(String string) {
		formpage page1 = new formpage(driver) ;
		page1.enterstory(string);

	}



	@Then("Check if valid input or missing fields or pattern mismatch")
	public void Check_if_valid_input_or_missing_fields_or_pattern_mismatch() {
		formpage page1 = new formpage(driver) ;
		Thankyoupage page2 = new Thankyoupage(driver) ;
		try{
			if( page1.isnamedisplayed()) {
				System.out.println("Missing field or pattern mismatch");
		}
			
		}
	   catch( NoSuchElementException e) {
		   System.out.println("valid input");
		}

	}



















}
