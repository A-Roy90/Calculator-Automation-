package sparq.sparqAssigment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalCBase {

	
public static WebDriver driver;					


	public void browserLaunch(String url) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
}

	
	public void mousehover(String mhxpath) 
	{
		Actions action = new Actions(driver);
		WebElement xpath = driver.findElement(By.xpath(mhxpath));	
		action.moveToElement(xpath).perform();
	}
	
	
}

