package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Css_selector {
	public static void main(String[] args) 
		
	throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("anandpatne10@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Anand@123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='submit']"));

}
}

	
	


