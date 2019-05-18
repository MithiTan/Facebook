package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebFunction {
	
	
public WebDriver driver;
	
	public void typexpath(String FBlocator ,String FBValues){
		//classname locators/classname values)
		driver.findElement(By.xpath(FBlocator)).sendKeys(FBValues);	
	}
	
	public void clickbyxpath(String FBlocator ){
		driver.findElement(By.xpath(FBlocator)).click();
		
	}
	public void clickbylinktext(String  FBlocator){
		driver.findElement(By.linkText( FBlocator)).click();
		
	}
	public void gettitle(String FBlocator){
		driver.findElement(By.xpath(FBlocator)).getText();
	}
	
		

}
