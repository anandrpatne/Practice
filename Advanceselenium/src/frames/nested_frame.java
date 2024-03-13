package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nested_frame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ADARSH/OneDrive/Desktop/selenium/frame1.html");
	WebElement t1 = driver.findElement(By.id("t1"));
	t1.sendKeys("abc");
	WebElement t2 = driver.findElement(By.id("t2"));
	t2.sendKeys("anand");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	t2.clear();
}
}
