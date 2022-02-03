package Week2_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("dv");
driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]//a")).click();
String actualTitle = driver.getTitle();
String expectedTitle ="View Lead | opentaps CRM";

if(actualTitle.equalsIgnoreCase(expectedTitle))
{
	System.out.println("Title Matched");
}
else {
	System.out.println("Title didn't match");
	}
driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
String Companyname = "Org1";
driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(Companyname);
driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
if (driver.findElement(By.xpath("//span[contains(text(),'Org1')]")).isDisplayed())
		{
	System.out.println("Updated Company name is displayed");
		}
driver.close();
	}
}
