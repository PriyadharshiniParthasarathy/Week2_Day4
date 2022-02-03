package Week2_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priyadharshini");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Parthasarathy");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@name='reg_passwd__']")).sendKeys("Password123");
WebElement day = driver.findElement(By.xpath("//span[@data-type='selectors']//select[@id='day']"));
Select day1 = new Select(day);
day1.selectByVisibleText("10");
WebElement Month = driver.findElement(By.xpath("//span[@data-type='selectors']//select[@title='Month']"));
Select Month1 = new Select(Month);
Month1.selectByIndex(10);
WebElement Year = driver.findElement(By.xpath("//span[@data-type='selectors']//select[@title='Year']"));
Select Year1 = new Select(Year);
Year1.selectByValue("1994");
driver.findElement(By.xpath("//label[text()='Female']")).click();
	}
}

