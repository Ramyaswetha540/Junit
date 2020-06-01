package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpages {
	
	ChromeDriver driver;

	
	@FindBy(linkText="REGISTER")
	WebElement reglink;
	@FindBy(id="email")
	WebElement user;
	@FindBy(name="password")
	WebElement pswd;
	@FindBy(name="confirmPassword")
	WebElement confpass;
	
	@FindBy(name="register")
	WebElement  sub;
	

	public  Registerpages(ChromeDriver driver)
	{
	   this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	public void clickregbutton()
	{
		reglink.click();
	}
	public void enterfdetails(String regname,String regpass,String conpass)
	{
		user.sendKeys(regname);
		pswd.sendKeys(regpass);
		confpass.sendKeys(conpass);
		sub.click();
		
	}
	
	
	
}
