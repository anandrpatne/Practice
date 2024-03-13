package Handlingxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relative_xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/ADARSH/OneDrive/Desktop/selenium/absolute%20xapth.html");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//input[@id='user']"));
	ele.sendKeys("hello");
	Thread.sleep(3000);
	ele.clear();
	Thread.sleep(0);
	driver.findElement(By.xpath("//a[@href='https://www.facebook.com']")).click();
	
	
}
}
