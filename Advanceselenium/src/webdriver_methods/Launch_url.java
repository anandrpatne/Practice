package webdriver_methods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_url {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver	driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
}
}
