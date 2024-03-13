package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.ClickAction;

public class youtube_12 {
//private static int html;
//private static int[] div;
//private static int body;

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("youtube")).sendKeys("BELAKIN AKVITHE SONG");
   Thread.sleep(2000);
   driver.findElement(By.cssSelector("song")).click();
    


}
}
