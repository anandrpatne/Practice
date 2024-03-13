package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class X_path {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("htmal/body/div[1]|input")).sendKeys("facebook");
	Thread.sleep(5000);
	driver.findElement(By.xpath("html/body/div[2]a")).click();

	
}
}
