/**
 * 
 */
package com.ibibo.ibibo_hotels.objectpages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author sushen
 *
 */
public class Base {
	public FileInputStream fis;
	public Properties prop;
	public WebDriver driver;
	
	public WebDriver initializeDriver()
	{
		 prop=new Properties();
		try {
			fis=new FileInputStream("./properties\\config.properties");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch(prop.getProperty("browserName"))
		{
		case "chrome":
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		case "firefox":
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		}
		case "edge":
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		}
		default:
		{
			System.out.println("Enter the correct browser name");
		}
		
		}
		driver.manage().window().maximize();
		return driver;
		
	}

}
