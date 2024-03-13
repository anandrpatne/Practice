package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	@Test
		public void login() throws InterruptedException
		{
	
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Pom_script p=new Pom_script(driver);
	p.passdata();
	Thread.sleep(2000);
	p.passpwd();
	Thread.sleep(2000);
	p.eleclick();
		}
	
	
	
	
	
	
}
