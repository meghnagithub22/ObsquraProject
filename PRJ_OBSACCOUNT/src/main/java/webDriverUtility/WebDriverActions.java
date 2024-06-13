package webDriverUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverActions 
{
	public WebDriver driver;
	private String iframe;

	public WebDriverActions(WebDriver driver)
	{
		this.driver = driver;
		

	}
public void Alertaccept() {
		org.openqa.selenium.Alert objalert = driver.switchTo().alert();
		objalert.accept();

	}

	public void Alertdismiss() {
		org.openqa.selenium.Alert objalert = driver.switchTo().alert();
		objalert.dismiss();
	}
 //Function to handle frame
	public void iframes(WebElement element) 
	{
		
		driver.switchTo().frame(element);
	}

	public void Javascripttestcase(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();" ,element);
	}
	
	// Common method implementation for webelement
	
	public void click(WebElement value) {
		value.click();
	}

	public void sendkeys(WebElement value, String value1) {
		value.clear();
		value.sendKeys(value1);
	}

	public void DropdownselectByvalue(WebElement dropdown, String value) {
		Select objSelect = new Select(dropdown);
		objSelect.selectByValue(value);

	}

	public void DropdownselectByIndex(WebElement dropdown, int value) {
		Select objSelect = new Select(dropdown);
	
    objSelect.selectByIndex(value);
	}
	
	public String getText(WebElement value) {
		String Value = value.getText();
		return Value;
	}
}
