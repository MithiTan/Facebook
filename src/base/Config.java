package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import utils.WebFunction;

public class Config extends WebFunction{
	@BeforeMethod

	public void beforeEachTest(){

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		//this the dynamic way to do 

		// init the chrome driver

		driver = new ChromeDriver();

		// lets go to facebook.com

		driver.get("http://www.facebook.com");

		// maximize the window 

		driver.manage().window().maximize();

		// wait 30 second to wait all elements to load in the page

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
}
