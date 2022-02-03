package Week2_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("http://leafground.com/pages/Button.html");
driver.findElement(By.xpath("//button[contains(text(),'Go to Home Page')]")).click();
String Actual_URL = driver.getCurrentUrl();
System.out.println(Actual_URL);
driver.navigate().back();
System.out.println("Position of button (x,y) is " +driver.findElement(By.xpath("//button[@id='position']")).getLocation());
System.out.println("Button color is " +driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
System.out.println("Height and width is " +driver.findElement(By.xpath("//button[@id='size']")).getSize());
	}

}
