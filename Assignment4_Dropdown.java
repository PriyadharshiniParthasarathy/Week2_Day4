package Week2_Day2;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("http://leafground.com/pages/Dropdown.html");
WebElement Index = driver.findElement(By.id("dropdown1"));
Select Index1 = new Select(Index);
Index1.selectByIndex(1);
WebElement Text = driver.findElement(By.name("dropdown2"));
Select Text1 = new Select(Text);
Text1.selectByVisibleText("Loadrunner");
WebElement Value = driver.findElement(By.id("dropdown3"));
Select Value1 = new Select(Value);
Value1.selectByValue("3");
Select select = new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
List<WebElement> list_options =select.getOptions();
int list_option_count = list_options.size();
System.out.println("No of Dropdown options " +list_option_count);
WebElement sendkeys = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]"));
sendkeys.sendKeys("Appium");
WebElement Multiple = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[1]"));
Select Multiple1 = new Select(Multiple);
Multiple1.selectByIndex(1);
Multiple1.selectByIndex(2);
Multiple1.selectByIndex(3);
Multiple1.selectByIndex(4);

	}
}
