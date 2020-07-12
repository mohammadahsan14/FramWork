package com.dell.BDDFrameWork.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/Users/Mohammad/eclipse-workspace/BDDFrameWork/src/test/java/com/dell/BDDFrameWork/config/config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//webDriver//chromedriver.exe");
			driver = new ChromeDriver();
			  
			  driver.manage().window().maximize(); 
			  driver.manage().deleteAllCookies();
			  driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,
			  TimeUnit.SECONDS);
			  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,
			  TimeUnit.SECONDS);
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");
			driver = new FirefoxDriver();
		}

		  

		
		 

	}

	public static void getDriver(String URL) {
		//driver.get(URL);
		driver.get(prop.getProperty("url"));
	}

}
