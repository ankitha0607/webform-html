package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Thankyoupage {

	WebDriver driver;

	By thankyoumessage = By.xpath("/html/body/div"); 


	public Thankyoupage(WebDriver driver) {

		this.driver = driver;
	}

	public boolean checkdisplaythankyou() {

		boolean k =driver.findElement(thankyoumessage).isDisplayed();
		return k;

	}

}
