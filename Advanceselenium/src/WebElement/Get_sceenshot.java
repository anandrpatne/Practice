package WebElement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Get_sceenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");

	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	//step1
	WebElement ele = driver.findElement(By.id("email"));
	File tmp = ele.getScreenshotAs(OutputType.FILE);
	//step2
	File pmt=new File("./element_photo/un_txt.jpg");
	//step3
	FileHandler.copy(tmp, pmt);
	
	
}
}