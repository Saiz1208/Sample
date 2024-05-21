package screenshot;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Chrome  {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("Chrome");
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SATHISH KUMAR S\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//ChromeOptions Options = new ChromeOptions();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		
		//Using ID=>
		
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();*/
		
		// Using Relative Xpath=>
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		/*driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		String str = driver.findElement(By.xpath("//span[@class='title']")).getText();
		System.out.println(str);*/
		Select sel = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		Thread.sleep(200);
		sel.selectByIndex(1);
		//sel.selectByValue("hilo");
		//sel.selectByVisibleText("Price (low to high)");
		
		
	}

}
