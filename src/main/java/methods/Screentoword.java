package methods;



	import java.io.IOException;


	import org.apache.xmlbeans.XmlException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	public class Screentoword extends reusable {


		public static String[] ScreenshotNames= new String[100];
		public static int array_increment=0;
		public static WebDriver driver;
		;
		public static void main(String[] args) throws IOException, XmlException 
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SATHISH KUMAR S\\Music\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			reusable.captureScreenshot(ScreenshotNames[array_increment++]="HomePage", driver);
			driver.findElement(By.name("q")).sendKeys("Ok google");
			reusable.captureScreenshot(ScreenshotNames[array_increment++]="TextTyped", driver);
			System.out.println("Test");
			reusable.saveScreenshotsToWordDocument("Test_Results",ScreenshotNames);
			
		}

	}

