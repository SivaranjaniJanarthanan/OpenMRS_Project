package com.pageobjectmodeltestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasstenstng.BaseClassTestNG;
import com.excelutilitytestng.ExcelUtilityTestNG;
import com.interfaceelementtestng.OpenMRSElementTestNG;
import com.propertytestng.FileReaderManagerMRSTestNG;

public class OpenMRSEndVisitTestNG extends BaseClassTestNG implements OpenMRSElementTestNG {

	@FindBy(xpath = endvisit_xpath)
	private WebElement end_visit;
	
	@FindBy(xpath = confirmendvisit_xpath)
	private WebElement confirmendvisit;
	
	@FindBy(xpath = startvist_xpath)
	private WebElement start_visit;

	@FindBy(id = confirmstartvisit_id)
	private WebElement confirm_visit;

	public OpenMRSEndVisitTestNG(WebDriver driver) { // Change to Constructor
		PageFactory.initElements(driver, this); // POM class methods initialized
	}

	public void validEndVisitPage() throws Throwable {

		FileReaderManagerMRSTestNG data = new FileReaderManagerMRSTestNG();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		end_visit.click();
		
		//Thread.sleep(3000);
		confirmendvisit.click();
		
		start_visit.click();

		confirm_visit.click();
		
		

	}
}
