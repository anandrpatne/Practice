package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Youtube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	Thread.sleep(5000);
	String title=driver.getTitle();
	System.out.println(title);
	String Url=driver.getCurrentUrl();
	System.out.println(Url);
	String psrc=driver.getPageSource();
	System.out.println(psrc);
	driver.close();
	}
}