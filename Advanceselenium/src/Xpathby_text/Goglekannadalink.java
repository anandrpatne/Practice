package Xpathby_text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Goglekannadalink {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.google.com/");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[text()='हिन्दी']")).click();
     
}}
