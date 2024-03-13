package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ANIMAL:Pehle Bhi Main(Full Video)");
    driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click(); 
   Thread.sleep(1000);
   driver.findElement(By.xpath("//img[@style='background-color: transparent;']")).click();
  driver.manage().window().maximize();

}
}
