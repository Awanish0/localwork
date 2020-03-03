package org.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttest {
	
	public static void main(String[] args)
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
	   
	    obj.get("https://www.facebook.com/");
	    
	    WebElement email=obj.findElement(By.id("email"));
	    email.sendKeys("awanish@gmail.com");
	    
	     email.findElement(By.id("u_0_2"));
	    
	    
	     
	}

}

