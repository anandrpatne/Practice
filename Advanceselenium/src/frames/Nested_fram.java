package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_fram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ADARSH/OneDrive/Desktop/selenium/f1frame.html");
	WebElement t1 = driver.findElement(By.id("t1"));
	t1.sendKeys("abc");
	WebElement t2 = driver.findElement(By.id("f1"));
	driver.switchTo().frame("t2");
}
}
