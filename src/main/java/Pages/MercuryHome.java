package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercuryHome {
	
ChromeDriver driver;
	

	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement button;
	
	
	
	public  MercuryHome(ChromeDriver driver)
	{
	   this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void login(String name,String pass)
	{
		username.sendKeys(name);
		password.sendKeys(pass);
		
	}
	
	public void clickbtn()
	{
		button.click();
	
	}

	
	

}
