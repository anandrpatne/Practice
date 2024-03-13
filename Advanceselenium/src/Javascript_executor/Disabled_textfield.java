package Javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disabled_textfield {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("file:///C:/Users/ADARSH/OneDrive/Desktop/selenium/disabled.html");
	Thread.sleep(2000);
	boolean ele = driver.findElement(By.id("i1")).isEnabled();
	if(ele)
	{
	System.out.println("element is enabled");
	}
	else
	{
		System.out.println("element is disabled");
	}
}
}

