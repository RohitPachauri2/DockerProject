package Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class practice2page extends BaseClass{
	String parenthandle="";
	public void url() throws InterruptedException{
		
		driver.get("https://academy.naveenautomationlabs.com/s/store");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
	}
	
	public void courseselection()throws InterruptedException{
		js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.cssSelector("div.main.container>div:last-child>div:nth-child(5)>a")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.main.container>div:last-child>div:nth-child(5)>a"))).click();
		
	}
	
	public void navigate_to_demo_site()throws InterruptedException{
		Thread.sleep(1000);
		parenthandle=driver.getWindowHandle();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section.navbar-section.menu-links>a:nth-child(2)"))).click();
		
		
		
	}
	
	public void windownavigation()throws InterruptedException{
		Set<String>windows=driver.getWindowHandles();
		for(String window:windows) {
			if(window!=parenthandle) {
				driver.switchTo().window(window);
			}
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[class='nav navbar-nav']>li:nth-child(3)")));
		action.moveToElement(driver.findElement(By.cssSelector("ul[class='nav navbar-nav']>li:nth-child(3)"))).perform();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[class='nav navbar-nav']>li:nth-child(3)>div>div>ul>li:nth-child(2)>a"))).click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parenthandle);
		Thread.sleep(2000);
	}
	
	
	

}
