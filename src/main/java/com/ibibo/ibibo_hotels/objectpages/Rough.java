package com.ibibo.ibibo_hotels.objectpages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rough {
	public static FileInputStream fis;

	public static void main(String[] args) {
		Properties prop=new Properties();
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
		System.out.println(prop.getProperty("URL"));
		switch(prop.getProperty("browserName"))
		{
		case "chrome":
		{
			System.out.println("chrome");
			break;
		}
		case "firefox":
		{
			System.out.println("firefox");
			break;
		}
		case "edge":
		{
			System.out.println("edge");
			break;
		}
		default:
		{
			System.out.println("Enter the correct browser name");
		}
		
		}
	}

}
