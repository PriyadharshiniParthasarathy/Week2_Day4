package Week2_Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("http://leafground.com/pages/checkbox.html");
driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected());
WebElement Firstname = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));

if(Firstname.isSelected())
{
	Firstname.click();
}
WebElement Secondname = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));

if(Secondname.isSelected())
{
	Secondname.click();
}
List<WebElement> chkBox1 = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input[@type='checkbox']"));
for(WebElement chkBox2 : chkBox1)
{
chkBox2.click();

}
	}
}


