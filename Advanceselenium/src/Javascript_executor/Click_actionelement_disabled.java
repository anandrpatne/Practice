package Javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Click_actionelement_disabled {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("file:///C:/Users/ADARSH/OneDrive/Desktop/selenium/disabledcheckbox.html");
	driver.findElement(By.name("n1"))
}
}
