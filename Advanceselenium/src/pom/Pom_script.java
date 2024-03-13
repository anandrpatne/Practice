package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_script {
@FindBy(id="email")
private WebElement Un;
@FindBy(id="pass")
private WebElement pwd;
@FindBy(xpath="//button[text()='Log in']")
private WebElement ele;
public Pom_script(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
public void passdata()
{
	Un.sendKeys("anand");
}
public void passpwd()
{
	pwd.sendKeys("anand@123");
}
public void eleclick()
{
ele.click();

}
}
