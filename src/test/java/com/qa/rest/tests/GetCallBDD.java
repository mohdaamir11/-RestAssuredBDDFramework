package com.qa.rest.tests;

import com.testing.framework.EmailUtils;
import org.apache.hc.core5.http.Message;
import org.bouncycastle.util.Properties;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.hamcrest.Matcher;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import org.hamcrest.collection.HasItemInArray;
import org.hamcrest.collection.IsArrayWithSize;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Arrays;
import java.util.List;



public class GetCallBDD {

	@Test
	public void test_NoOfCircuitsin2023()
	{
//		given().
//		when().
//		then().
//		assert()
		
//		Response response = 
		given().
		when()
		    .get("http://ergast.com/api/f1/2017/circuits.json").
		then()
		    .statusCode(200)	    
		
//		String str = response.getBody().asString();
//		System.out.println(str);
		
//		.assertThat().body("MRData.CircuitTable.Circuits.circuitId", hasSize(22));
//		.header("Connection","keep-alive");
		    .assertThat().statusCode(200)
		.header("Connection","keep-alive");
	}
	
	
//	@Test
//	public void emailRead() throws InterruptedException {
//		driver.get("https://onedrive.live.com/login/");
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		int size = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(size);
//		driver.switchTo().frame(0).findElement(By.xpath("//input[@placeholder='Email, phone, or Skype']")).sendKeys("venomaamir@outlook.com");
//        System.out.println("entered email"); 
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.ENTER).build().perform();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		int size1 = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(size1);
//		Thread.sleep(Duration.ofSeconds(5));
//		driver.findElement(By.linkText("Forgot password?")).click(); 
//		driver.findElement(By.xpath("//input[@type='radio']")).click();
//		action.sendKeys(Keys.ENTER); 
//		driver.findElement(By.xpath("//input[@placeholder='Last 4 digits of phone number']")).sendKeys("5192");
//		//input[@type='submit']
//		action.sendKeys(Keys.ENTER); 
//	}
	
	
}
