package Week2_Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("http://leafground.com/pages/Link.html");
WebElement Home = driver.findElement(By.linkText("Go to Home Page"));
Home.click();
driver.navigate().back();
WebElement Wheretogo = driver.findElement(By.partialLinkText("Find where"));
String Wheretogo_Titlename = Wheretogo.getAttribute("href");
System.out.println("URL:- "+ Wheretogo_Titlename);
WebElement Error =driver.findElement(By.linkText("Verify am I broken?"));
Error.click();
if(driver.getTitle().contains("404"))
{
	System.out.println("Facing 404 error");
}

driver.navigate().back();
WebElement Home1 = driver.findElement(By.linkText("Go to Home Page"));
Home1.click();
driver.navigate().back();
List<WebElement> Linkcount = driver.findElements(By.partialLinkText("a"));
int linkcount1 = Linkcount.size();
System.out.println(linkcount1);







	}

}
