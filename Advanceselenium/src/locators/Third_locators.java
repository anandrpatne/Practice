package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third_locators {

	public static void main(String[] args ) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/ADARSH/OneDrive/Desktop/selenium/link.html");
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).click();
	}
}
