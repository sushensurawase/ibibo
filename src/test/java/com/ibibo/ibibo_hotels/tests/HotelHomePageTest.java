/**
 * 
 */
package com.ibibo.ibibo_hotels.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ibibo.ibibo_hotels.objectpages.Base;
import com.ibibo.ibibo_hotels.objectpages.HotelHomePage;

/**
 * @author sushen
 *
 */
public class HotelHomePageTest extends Base {
	@BeforeMethod
	public void setUp()
	{
		driver=initializeDriver();
	}
	
	@Test
	public void verifySearchWithValidData()
	{
	
		
		
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HotelHomePage hotelHomePage=new HotelHomePage(driver);
		hotelHomePage.clickOnIndiacheckbox();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		hotelHomePage.clickOnCity("mumbai");
		
		hotelHomePage.clickOnCheckinInput();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hotelHomePage.selectMonthYear("20","August", "2021");
		
		hotelHomePage.selectMonthYear("25", "August", "2021");
		hotelHomePage.clickOnGuestAndRoomsInput();
		hotelHomePage.increaseRooms();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hotelHomePage.increaseAdultNumber();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hotelHomePage.increaseChildsNumber();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hotelHomePage.increaseChildsNumber();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hotelHomePage.clickOnChildTwoDrp();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		hotelHomePage.clickOnDoneButton();
		hotelHomePage.clickOnSearchBtn();
		
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
