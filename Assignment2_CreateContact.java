package Week2_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Contacts')][1]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Create Contact')][1]")).click();
driver.findElement(By.id("firstNameField")).sendKeys("Priyadharshini");
driver.findElement(By.id("lastNameField")).sendKeys("Parthasarathy");
driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Hi");
driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Hello");
driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Automation testing");
driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("alpha123@gmail.com");
WebElement State = (driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']")));
Select State1 = new Select(State);
State1.selectByVisibleText("New York");
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
driver.findElement(By.xpath("//textarea[@name='description']")).clear();
driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Modified by the user");
driver.findElement(By.xpath("//input[@value='Update']")).click();
System.out.println("Browser title :- " +driver.getTitle());
	}

}
