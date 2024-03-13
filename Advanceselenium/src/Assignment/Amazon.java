package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone 14 pro");
   Thread.sleep(1000);
   driver.findElement(By.xpath("//input[@type='submit']")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//body[@id='a-page']")).click();
driver.findElement(By.xpath("//span[text()='iPhone 14 Plus (128 GB) - Starlight']")).click();
//driver.findElement(By.xpath("//img[@class='s-image' and@ data-image-index='1']")).click();
}
}
