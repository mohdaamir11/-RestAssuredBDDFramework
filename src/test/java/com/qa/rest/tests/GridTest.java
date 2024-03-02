package com.qa.rest.tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GridTest {

	WebDriver driver;
	
	
	@BeforeMethod 
	void initSetup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
//		Thread.sleep(Duration.ofSeconds(3));
//		System.out.println(driver.getWindowHandle());
	}
	
	
	@Test
	void clickingON()
	{
		List<WebElement> f = driver.findElements(By.tagName("iframe"));
	      System.out.println("Total number " + f.size());
	      driver.switchTo().frame(0);
	      
		driver.findElement(By.id("lensSearchButton")).click();
		
		driver.quit();
	}
	
//	@Test
//	void setup()
//	{
//		
//      System.out.println("i am in setup " + Thread.currentThread().threadId());
//      driver.close();
//	}
	
//	@Test
//	void login() throws InterruptedException {
//		
//		
//		
//		driver.findElement(By.id("username")).sendKeys("venomaamir@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@selenium123");
//		driver.findElement(By.xpath("//input[@name='login']")).click();
//		String str = driver.findElement(By.xpath("//p/strong[contains(text(),'venomaamir')]")).getText();
//		
//		System.out.println("i am in login " + Thread.currentThread().threadId());
//		Assert.assertEquals(str,"venomaamir", "string matched");
//		Thread.sleep(Duration.ofSeconds(3));
//		
//		
//		driver.close();
//		
//		
//	}
	
//	@Test
//	void handleRightclick() throws InterruptedException
//	{
//		
//		Actions action = new Actions(driver);
//		action.contextClick(driver.findElement(By.xpath("//a[normalize-space()='Test Cases']"))).perform();
//		System.out.println("DONE RIGHT CLICK");
//		Thread.sleep(Duration.ofSeconds(3));
//		driver.close();
//		
//	}  
	
//	@Test
//	void CharLengthcount()
//	{
//		String str1="a quick brown fox jumps over a little lazy dog";
				
//		String[] str = str1.split(" ");
	
		
//				System.out.println(countchar(str1, "o"));				
//				List<String> lst = new ArrayList<String>();
				
//				lst.add(str1);
        
		//   REVERSED A SENTENCE COMPLETELY
//		String str1="a quick brown fox jumps over a little lazy dog";
//      char[] gfg = str1.toCharArray();
//        for (int i=gfg.length-1; i >= 0; i--) {
//        	
//        	Character ch1 = gfg[i];
//            System.out.print(ch1 + " "); // Print each character
//           
//        }
            
		// STORED EACH WORD FROM A SENTENCE IN AN ARRAY 
//        String str1="a quick brown fox jumps over a little lazy dog";
//        String[] str = str1.split(" ");
//        
//          for (int i=0; i < str.length; i++) {
//          	
//              System.out.print(str[i] + "     "); // Print each word
//             
//          }
         
		
		// REVERSED THE WORDS IN A SENTENCE
//		String str1="a quick brown fox jumps over a little lazy dog";
//       String[] str = str1.split(" ");
//          for (int j=str.length-1 ; j >= 0 ; j-- )
//          {
//          System.out.print(str[j]+" ");
//          }
//            
//        }
 
//        System.out.println(gfg);
		
		// FIND IF ANY CHARACTER IS DUPLICATE and PRINT 
//		String str1="kkmirm";
//      char[] gfg = str1.toCharArray();
//		for (int i = 0; i < gfg.length; i++) {
//            for (int j = i + 1; j < gfg.length; j++) {
//                if (gfg[i] == gfg[j]) {
//                    System.out.println(gfg[i]);
//                      // Break after printing the first occurrence of the duplicate
//                }
//            }
//        }
//    }
				
	
	// count a characters occurance in a sentence
//	static int countchar(String str, String c)
//	{
//		int totalcharactercount = str.length();
//		int countafterRemovingC =str.replace(c,"").length();
//		int totalc = totalcharactercount - countafterRemovingC;
//		return totalc;
//	}
	
	
}
