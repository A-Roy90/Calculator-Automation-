package sparq.sparqAssigment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalcTest extends CalCBase {

	
		/**
		 * launch browser
		 * @throws InterruptedException
		 */
	
		@BeforeSuite
		public void setup() throws InterruptedException
		{
			browserLaunch("https://www.calculator.net/");
		
		}
		
		
		/**
		 * test case for multiplication operation
		 * @throws AWTException
		 * @throws InterruptedException
		 */
		
		@Test
		public void testCase1() throws AWTException, InterruptedException
		{
			
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_4);
			rb.keyRelease(KeyEvent.VK_4);
			rb.keyPress(KeyEvent.VK_2);
			rb.keyRelease(KeyEvent.VK_2);
			rb.keyPress(KeyEvent.VK_3);
			rb.keyRelease(KeyEvent.VK_3);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
			Thread.sleep(1000);
			rb.keyPress(KeyEvent.VK_5);
			rb.keyRelease(KeyEvent.VK_5);
			rb.keyPress(KeyEvent.VK_2);
			rb.keyRelease(KeyEvent.VK_2);
			rb.keyPress(KeyEvent.VK_5);
			rb.keyRelease(KeyEvent.VK_5);
			Thread.sleep(3000);
		}
		
		
		/**
		 * test case for division operation
		 * @throws AWTException
		 * @throws InterruptedException
		 */
		
		@Test
		public void testCase2() throws AWTException, InterruptedException
		{
			Robot rb1 = new Robot();
			rb1.keyPress(KeyEvent.VK_4);
			rb1.keyRelease(KeyEvent.VK_4);
			rb1.keyPress(KeyEvent.VK_0);
			rb1.keyRelease(KeyEvent.VK_0);
			rb1.keyPress(KeyEvent.VK_0);
			rb1.keyRelease(KeyEvent.VK_0);
			rb1.keyPress(KeyEvent.VK_0);
			rb1.keyRelease(KeyEvent.VK_0);
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click(); // divisionSign
			
			Thread.sleep(1000);
			
			rb1.keyPress(KeyEvent.VK_2);
			rb1.keyRelease(KeyEvent.VK_2);
			rb1.keyPress(KeyEvent.VK_0);
			rb1.keyRelease(KeyEvent.VK_0);
			rb1.keyPress(KeyEvent.VK_0);
			rb1.keyRelease(KeyEvent.VK_0);
			
			Thread.sleep(3000);
			
		}
		
		/**
		 * test case for addition operation
		 * @throws AWTException
		 * @throws InterruptedException
		 */
		@Test
		public void testCase3() throws AWTException, InterruptedException
		{
			Robot rb2 = new Robot();
			rb2.keyPress(KeyEvent.VK_2);
			rb2.keyRelease(KeyEvent.VK_2);
			rb2.keyPress(KeyEvent.VK_3);
			rb2.keyRelease(KeyEvent.VK_3);
			rb2.keyPress(KeyEvent.VK_4);
			rb2.keyRelease(KeyEvent.VK_4);
			rb2.keyPress(KeyEvent.VK_2);
			rb2.keyRelease(KeyEvent.VK_2);
			rb2.keyPress(KeyEvent.VK_3);
			rb2.keyRelease(KeyEvent.VK_3);
			rb2.keyPress(KeyEvent.VK_4);
			rb2.keyRelease(KeyEvent.VK_4);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[1]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click(); 
			
			rb2.keyPress(KeyEvent.VK_3);
			rb2.keyRelease(KeyEvent.VK_3);
			rb2.keyPress(KeyEvent.VK_4);
			rb2.keyRelease(KeyEvent.VK_4);
			rb2.keyPress(KeyEvent.VK_5);
			rb2.keyRelease(KeyEvent.VK_5);
			rb2.keyPress(KeyEvent.VK_3);
			rb2.keyRelease(KeyEvent.VK_3);
			rb2.keyPress(KeyEvent.VK_4);
			rb2.keyRelease(KeyEvent.VK_4);
			rb2.keyPress(KeyEvent.VK_5);
			rb2.keyRelease(KeyEvent.VK_5);
			
			Thread.sleep(3000);
			
		}
		
		
		/**
		 * test case for subtraction operation
		 * @throws AWTException
		 * @throws InterruptedException
		 */
		@Test
		public void testCase4() throws AWTException, InterruptedException
		{
			Robot rb3 = new Robot();
			rb3.keyPress(KeyEvent.VK_2);
			rb3.keyRelease(KeyEvent.VK_2);
			rb3.keyPress(KeyEvent.VK_3);
			rb3.keyRelease(KeyEvent.VK_3);
			rb3.keyPress(KeyEvent.VK_4);
			rb3.keyRelease(KeyEvent.VK_4);
			rb3.keyPress(KeyEvent.VK_8);
			rb3.keyRelease(KeyEvent.VK_8);
			rb3.keyPress(KeyEvent.VK_2);
			rb3.keyRelease(KeyEvent.VK_2);
			rb3.keyPress(KeyEvent.VK_3);
			rb3.keyRelease(KeyEvent.VK_3);
			
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
			
			Thread.sleep(1000);
			
			rb3.keyPress(KeyEvent.VK_2);
			rb3.keyRelease(KeyEvent.VK_2);
			rb3.keyPress(KeyEvent.VK_3);
			rb3.keyRelease(KeyEvent.VK_3);
			rb3.keyPress(KeyEvent.VK_0);
			rb3.keyRelease(KeyEvent.VK_0);
			rb3.keyPress(KeyEvent.VK_9);
			rb3.keyRelease(KeyEvent.VK_9);
			rb3.keyPress(KeyEvent.VK_4);
			rb3.keyRelease(KeyEvent.VK_4);
			rb3.keyPress(KeyEvent.VK_8);
			rb3.keyRelease(KeyEvent.VK_8);
			rb3.keyPress(KeyEvent.VK_2);
			rb3.keyRelease(KeyEvent.VK_2);
			rb3.keyPress(KeyEvent.VK_3);
			rb3.keyRelease(KeyEvent.VK_3);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[1]")).click(); 
			
			Thread.sleep(2000);
			
		}
		
		
		/**
		 * clears calculator field
		 * @throws InterruptedException
		 */
		
		@AfterMethod
		public void clearFlied() throws InterruptedException
		{
			driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
			Thread.sleep(3000);
			
		}
		
		/**
		 * closes the browser
		 */
		
		@AfterSuite
		public void closeWindow()
		{
			driver.quit();
		}
}
