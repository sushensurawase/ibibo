/**
 * 
 */
package com.ibibo.ibibo_hotels.objectpages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author sushen
 *
 */
public class HotelHomePage {
	WebDriver driver;
	
	
	public HotelHomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By indiaCheckbox=By.xpath("(//input[@type='radio' ])[1]");
	By wheredrp=By.xpath("//input[@id='downshift-1-input' ]");
	
	By whereDrpOptions=By.xpath("//input[@id='downshift-1-input' ]/following-sibling::ul");
	By checkInInput=By.xpath("//div[@data-testid='openCheckinCalendar']/h4");
	
	//calender element
	By arrayLeftIconCalender=By.xpath("(//div[@class='dcalendarstyles__SliderArrow-sc-r2jz2t-14 ipNVzX'])[1]");
	By arrayRightIconCalender=By.xpath("(//div[@class='dcalendarstyles__SliderArrow-sc-r2jz2t-14 ipNVzX'])[2]");
	By monthYearElement=By.xpath("//div[@data-testid='calendarLeftArrowBtn']/following-sibling::p");
	By dateElements=By.xpath("//li[@style='color: black;']");
	
	By checkOutInput=By.xpath("//button[@data-testid='searchHotelBtn']/preceding-sibling::div[1]/span");
	By guestRoomsInput=By.xpath("//input[@class='SearchBlockUIstyles__CitySearchInput-sc-fity7j-12 uGGSH']");
	By roomPlusBtn=By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[2]");
	By roomMinusBtn=By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[1]");
	By adultPlusBtn=By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[4]");
	By adultMinusBtn=By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[3]");
	By childPlusBtn=By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[6]");
	By childminusBtn=By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[5]");
	By childAgeTwoElement=By.xpath("//div[@class='PaxWidgetstyles__WrapperDiv-sc-gv3w6r-0 rtDzo']/div/div[3]");
	By childOneDrp=By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[7]/parent::div");
	By childTwoDrp=By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[8]/parent::div");
	By doneBtn=By.xpath("//div[@class='PaxWidgetstyles__ButtonWrapperDiv-sc-gv3w6r-10 bVzuTd']/button");
	By childAgesFromDrp=By.xpath("//ul[@class='PaxWidgetstyles__ChildDropdownWrap-sc-gv3w6r-9 cuOfFa']");
	By searchBtn=By.xpath("//button[@data-testid='searchHotelBtn']");
	
	/**
	 * 
	 * @param locator
	 * @return
	 */
	
	public WebElement getWebElement(By locator)
	{
		return driver.findElement( locator);
	}
	/**
	 * 
	 * @param locator
	 * @return
	 */
	public List<WebElement> getWebElements(By locator)
	{
		return driver.findElements(locator);
	}
	/**
	 * <p> This method will click on checkbox which is present left to the india text</p>
	 * <p> which is present on top of hotel homepage </p>
	 * @return void
	 */
	public void clickOnIndiacheckbox()
	{
		getWebElement(indiaCheckbox).click();
	}
	/**
	 * this method will type cityName in whereinput box
	 * @return void
	 * @param cityName
	 */
	
	public void whereInputBox(String cityName)
	{
		getWebElement(wheredrp).sendKeys(cityName);
	}
	/**
	 * This method will click on checkin input present on hotel home page
	 * @return void
	 */
	
	public void clickOnCheckinInput() {
		getWebElement(checkInInput).click();;
	}
	/**
	 * This method will click on checkout input present on hotel home page
	 * @return void
	 */
	
	public void clickOnCheckoutInput() {
		getWebElement(checkOutInput).click();
	}
	
	/**
	 * This method select day,month(first letter of month should be in cap) and year from calender
	 * @param day
	 * @param month
	 * @param year
	 * @return void
	 */
	
	public void selectMonthYear(String day,String month,String year)
	{
		
	
		List<WebElement> dateElementsList= getWebElements(dateElements);
		
		while(!(getWebElement(monthYearElement).getText().split(" ")[0].equals(month) && getWebElement(monthYearElement).getText().split(" ")[1].equals(year)))
		{
			getWebElement(arrayRightIconCalender).click();
			
		}
		Iterator<WebElement> itr=dateElementsList.iterator();
		while(itr.hasNext())
		{
			WebElement dateElement=itr.next();
			if(dateElement.getText().equals(day))
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				dateElement.click();
				break;
			}
		}
		
	}
	/**
	 * This method clicks on guests and rooms input box 
	 */
	public void clickOnGuestAndRoomsInput()
	{
		getWebElement(guestRoomsInput).click();
	}
	
	/**
	 * This methos is used to increase room by one for each click
	 */
	
	public void increaseRooms()
	{
		getWebElement(roomPlusBtn).click();
		
	}
	/**
	 * This methos is used to increase adults member by one for each click
	 */
	public void increaseAdultNumber()
	{
		getWebElement(adultPlusBtn).click();
		
	}
	/**
	 * This methos is used to increase child member by one for each click
	 */
	public void increaseChildsNumber()
	{
		getWebElement(childPlusBtn).click();
	}
	
	/**
	 * This method is used to select age of child from dropdown
	 * @param childAge
	 */
	public void selectChildAge(String childAge)
	{
		List<WebElement> childAgesList=getWebElements(childAgesFromDrp);
		
		for(int i=0;i<childAgesList.size();i++)
		{
			WebElement childAgeElement=childAgesList.get(i);
			if(childAgeElement.getText().equals(childAge))
			{
				childAgeElement.click();
				break;
			}
		}
		
	}
	/**
	 * <p>This mrthod is used to click on done button which is avalable</p> to us after clicking guests and rooms input box
	 */
	public void clickOnDoneButton()
	{
		getWebElement(doneBtn).click();
	}
	/**
	 * This method return true if child2 element gets displayed
	 * @return
	 */
	
	public boolean isChildTwoEnabled()
	{
		return getWebElement(childAgeTwoElement).isDisplayed();
	}
	/**
	 * This method will click on second child age input box
	 */
	public void clickOnChildTwoDrp()
	{
		getWebElement(childAgeTwoElement).click();
	}
	/**
	 * This method will click on search hotels button
	 */
	public void clickOnSearchBtn()
	{
		getWebElement(searchBtn).click();
	}
	public void clickOnCity(String cityName) {
		getWebElement(wheredrp).click();
		getWebElement(wheredrp).sendKeys(cityName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> drpList=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(whereDrpOptions));
		drpList.get(0).click();
	}
	
	
	
	
	
	
	
	
	
	

}
