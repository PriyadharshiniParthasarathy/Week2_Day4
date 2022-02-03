package Week2_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_Edit {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("http://leafground.com/pages/Edit.html");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Alpha123@gmail.com");
WebElement Append = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]//input"));
String previousText = Append.getAttribute("value");
Append.clear();
Append.sendKeys("Datalevel - " + previousText +Keys.TAB);
System.out.println(driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value"));
driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
if(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[5]//input")).isEnabled())
{
	System.out.println("Text field is Enabled - Condition is False");
	}
else
{
	System.out.println("Text field is disabled - Condition is True");
	}
	
}
}
