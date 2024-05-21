package screenshot;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge {
		public static void main(String[] args){
			System.out.println("Edge");
			// TODO Auto-generated method stub
			System.setProperty("webdriver.edge.driver","C:\\Users\\SATHISH KUMAR S\\Music\\edge\\msedgedriver.exe");
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new EdgeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get("https://www.saucedemo.com/");
			System.out.println(driver.getTitle());
			
			//Using ID
			
			/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();*/
			
			// Using Relative Xpath 
			
			WebElement user= driver.findElement(By.xpath("//input[@id='user-name']"));
			user.sendKeys("standard_user");
			/*user.clear();
			user.sendKeys("locked_out_user");*/
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("secret_sauce");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
			login.click();
			
			String s = driver.findElement(By.xpath("//span[@class='title']")).getText();
			System.out.println(s);
			if (s.equals("Products")) {
				System.out.println("Pass");	
			}
			else {
				System.out.println("Fail");
			}
		}
}

