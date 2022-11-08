package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class formpage {
	WebDriver driver;

	By nametextbox = By.id("box1"); 
	By addressbox = By.id("box2");
	By storybox = By.id("box3");
	By submitbutton = By.xpath("/html/body/form/ul/div[4]/input");

	public formpage(WebDriver driver) {

		this.driver = driver;
	}

	public void entername(CharSequence input) {

		driver.findElement(nametextbox).sendKeys(input);

	}

	public void enteraddress(CharSequence input) {

		driver.findElement(addressbox).sendKeys(input);

	}

	public void enterstory(CharSequence input) {

		driver.findElement(storybox).sendKeys(input);

	} 

	public void clickthesubmitbutton() {

		driver.findElement(submitbutton).click();

	} 

	public void checknamemaxlength() {

		String namelen = driver.findElement(nametextbox).getAttribute("maxlength");
		if(namelen.contentEquals("30") ) {
			System.out.println("max length is 30");	 
		}
		else {
			System.out.println("max length is  not 30");

		}
	}


	public void checkaddressmaxlength() {

		String addlen = driver.findElement(addressbox).getAttribute("maxlength");

		if(addlen.contentEquals("50")) {
			System.out.println("max length is 50");	 
		}
		else {
			System.out.println("max length is not 50");

		}
	}


	public void checkstorymaxlength() {

		String storylen = driver.findElement(storybox).getAttribute("maxlength");

		if(storylen.contentEquals("200")) {
			System.out.println("max length is 200");	 
		}
		else {
			System.out.println("max length is not 200");

		}




	}

	public boolean isnamedisplayed() {

		boolean l = driver.findElement(nametextbox).isDisplayed();
		return l;

	} 







}
