package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Word extends Takesscreenshot{
//Screenshot=>
	public static void screeenshot(WebDriver driver)
	{
	TakesScreenshot str = (TakesScreenshot) driver;
	File f= str.getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(f, new File ("C:\\Users\\SATHISH KUMAR S\\eclipse-workspace\\Sample\\Capture\\Test"+System.currentTimeMillis()+".jpg"));
		System.out.println("Screenshot Taken=>");
		} 
	catch(IOException e) {
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SATHISH KUMAR S\\\\Music\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		screeenshot(driver);
	}

}
