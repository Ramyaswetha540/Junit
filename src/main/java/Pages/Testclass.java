package Pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testclass {
	
	ChromeDriver driver;
	MercuryHome home;

	
	@Before
	public void setUp()
	{
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		  driver.manage().window().maximize();
		           
	}
    @Test
	public void loginpage() {
		
		home=new MercuryHome(driver);
		home.login("ramya","swetha");
		home.clickbtn();
		Registerpages rp=new Registerpages(driver);
		rp.clickregbutton();
		rp.enterfdetails("aadya", "datar","datar" );
		rp.clickregbutton();
	}

    
    @After
    public void TearDown()
    {
    	driver.quit();
    }
	
	
	
	
}
