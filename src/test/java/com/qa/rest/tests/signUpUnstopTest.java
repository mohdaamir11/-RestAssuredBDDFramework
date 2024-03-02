package com.qa.rest.tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.testing.framework.EmailUtils;


import org.testng.Assert;

public class signUpUnstopTest {

	WebDriver driver;
	public String SigningUpAs = "Organizer"; // use Candidate/Recruiter/Organizer
	EmailUtils emailUtil;
	
	@BeforeMethod
	void initSetup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://unstop.com/auth/signup?returnUrl=%2F");
		
		if(SigningUpAs.equals("Candidate"))
		{
		driver.findElement(By.xpath("//label[@for='user_category0']")).click();   
		System.out.println("inside the candidate");
		}
		else if (SigningUpAs.equals("Recruiter")) {
			driver.findElement(By.xpath("//label[@for='user_category1']")).click(); 
			System.out.println("inside the Recuiter");
		}
		else if (SigningUpAs.equals("Organizer")) {
			driver.findElement(By.xpath("//label[@for='user_category2']")).click(); 
			System.out.println("inside the Organizer");
		}else {
			System.out.println("pls give a value in SigningUpAs variable");
		}
		
	}
	
	@Test
	public void SignUp() throws InterruptedException {
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulkumar"); 	
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("rahul.kumar123@yopmail.com"); 
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("9717135192"); 
		driver.findElement(By.xpath("//input[@id='choose_password']")).sendKeys("Mobile1!"); //input[@id='confirm_password']
		driver.findElement(By.xpath("//input[@id='confirm_password']")).sendKeys("Mobile1!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'All your information is collected, stored and proc')]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
		// after above step, application is showing a bot/human detection verification which i will ask developer to bypass on QA environment, so that we can proceed to home page
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
        Assert.assertEquals( pagetitle, "home page");
		driver.close();
		}
	   
	@Test
	public void carouselItems() {
		driver.get("https://unstop.com/auth/signup?returnUrl=%2F");
		
	}
		
}

