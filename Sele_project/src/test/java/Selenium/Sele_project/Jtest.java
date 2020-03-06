package Selenium.Sele_project;
    import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Jtest {
		
          ChromeDriver driver;	  
	    public static void main (String[]args)
			{
			  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			WebElement User= driver.findElement(By.id("email"));
		     User.sendKeys("Awanih"); 
		     WebElement password= driver.findElement(By.id("pass"));
		     password.sendKeys("21121");
		     WebElement login=driver.findElement(By.id("loginbutton"));
		     login.click();
		     driver.close();
		  	
		   
	   }

}
