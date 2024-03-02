package com.qa.rest.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePicker {

	WebDriver driver;
	
	@BeforeMethod
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
	@Test
	private void selectDate() {
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		int size1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size1);
		
        driver.switchTo().frame(3).findElement(By.xpath("//input[@id='datepicker']")).click();
        System.out.println("clicked on empty space");
         new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='ui-datepicker-div']")));
         System.out.println("waited for 5 mins");
         
         String monthyearValue = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	    System.out.println(monthyearValue);
	    String month=monthyearValue.split(" ")[0].trim();	    
	    String year=monthyearValue.split(" ")[1].trim();	
	    
	    while (!(month.equals("June") && year.equals("2024"))) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
			 monthyearValue = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			    System.out.println(monthyearValue);
			    month = monthyearValue.split(" ")[0].trim();	    
			    year = monthyearValue.split(" ")[1].trim();
			    
		}

	    driver.findElement(By.linkText("19")).click();
	    
	    
	  driver.close();
	}
	
}
