package Week2_Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("http://leafground.com/pages/Image.html");
WebElement Home = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
Home.click();
driver.navigate().back();
WebElement Brk_Image = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
if(Brk_Image.getAttribute("naturalWidth").equals("0"))
		{
	System.out.println("Image is broken");
		}
else
{
	System.out.println("Image is not broken");
		}
WebElement txtUsername = driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
Actions builder = new Actions(driver);
builder.contextClick(txtUsername).perform();
System.out.println(driver.getTitle());


	}
}
