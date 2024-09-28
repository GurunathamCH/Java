package TestScripts;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Horama {
	 
	  @Test
	  public void horamatBasicStep() {
	WebDriver driver;
		  
		
			    driver = new ChromeDriver();
			   
	    driver.get("https://www.horamait.com/");
	   // driver.manage().window().setSize(new Dimension(1296, 696));
	    driver.findElement(By.cssSelector("#top-menu > .navPages > .moduleMenu:nth-child(2) .txt-container")).click();
	    driver.findElement(By.cssSelector("#top-menu > .navPages > .moduleMenu:nth-child(3) .txt-container")).click();
	    driver.findElement(By.cssSelector(".navPages > .moduleMenu:nth-child(4) > .page-unique > .txt-container")).click();
	    driver.findElement(By.linkText("WORKSHOPS")).click();
	    System.out.println("navigated to work shops page");
	  }

}
