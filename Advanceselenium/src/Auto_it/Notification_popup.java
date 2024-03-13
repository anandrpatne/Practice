package Auto_it;

import java.awt.Window;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notification_popup {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/");
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C:\\Users\\ADARSH\\OneDrive\\Desktop\\autoit\\irctc.exe\\");
}
}
