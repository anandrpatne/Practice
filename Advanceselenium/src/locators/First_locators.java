package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_locators {
public static void main(String[] args ) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ADARSH/OneDrive/Desktop/selenium/link.html");
	Thread.sleep(2000);
driver.findElement(By.id("facebook")).click();
}
}