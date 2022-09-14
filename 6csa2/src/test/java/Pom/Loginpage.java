package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    public	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}	

	
@FindBy(xpath="//a[text()='Logout']")
private WebElement logout;
public WebElement getLogout() {
	return logout;
}

}
