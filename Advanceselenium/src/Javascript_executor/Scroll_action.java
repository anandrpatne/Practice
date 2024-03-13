package Javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_action {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window,scrollBy(0,550)");
		
	
}
}
