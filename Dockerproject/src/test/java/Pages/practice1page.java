package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1page {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;
	JavascriptExecutor js;
	public void url()throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		action=new Actions(driver);
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		js=(JavascriptExecutor)driver;
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://testautomationpractice.blogspot.com/"));
		
	}
	
	public void inputs(String val1,String val2,String val3)throws InterruptedException{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys(val1);
		Thread.sleep(500);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(val2);
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone"))).sendKeys(val3);
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("textarea"))).sendKeys("sample address ok ok ok !!!!!!");
		Thread.sleep(500);
		
	}
	
	public void dynamicbutton()throws InterruptedException{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("start"))).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("stop"))).click();
		
	}
	
	public void alerts()throws InterruptedException{
		WebElement aaertbtn=driver.findElement(By.cssSelector("button#promptBtn"));
		js.executeScript("arguments[0].scrollIntoView(true)", aaertbtn);
		aaertbtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.sendKeys("harry potter:");
		alert1.accept();
		
	}
	
	public void datepicker()throws InterruptedException{
		WebElement datepicker1=driver.findElement(By.id("datepicker"));
		js.executeScript("arguments[0].scrollIntoView(true)", datepicker1);
		datepicker1.sendKeys("01/29/2023");
		Thread.sleep(500);
		action.sendKeys(Keys.ENTER).perform();
		
		WebElement datepicker2=driver.findElement(By.id("txtDate"));
		js.executeScript("arguments[0].scrollIntoView(true)", datepicker2);
		datepicker2.sendKeys("09/15/2025");
		Thread.sleep(500);
		action.sendKeys(Keys.ENTER).perform();
		
		WebElement datepicker3=driver.findElement(By.id("start-date"));
		js.executeScript("arguments[0].scrollIntoView(true)", datepicker3);
		datepicker3.sendKeys("09/15/2025");
		
		WebElement datepicker4=driver.findElement(By.id("end-date"));
		js.executeScript("arguments[0].scrollIntoView(true)", datepicker4);
		datepicker4.sendKeys("09/15/2025");
		
		Thread.sleep(3000);
		
		
	}
	
	
	
	

}
