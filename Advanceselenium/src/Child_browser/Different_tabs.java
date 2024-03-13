package Child_browser;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Different_tabs {
public static void main(String[] args) throws AWTException  {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.selenium.dev/");
	driver.manage().window().maximize();
	Robot r=new Robot();
	for(int i=1;i
	{
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
	}
	//Set<String> hd = driver.getWindowHandles();
	
	
}
}
