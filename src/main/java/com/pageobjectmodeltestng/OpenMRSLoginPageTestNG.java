package com.pageobjectmodeltestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.baseclasstenstng.BaseClassTestNG;
import com.interfaceelementtestng.OpenMRSElementTestNG;
import com.propertytestng.FileReaderManagerMRSTestNG;

public class OpenMRSLoginPageTestNG extends BaseClassTestNG implements OpenMRSElementTestNG {
	
	@FindBy(id = userName_id)
	private WebElement username;

	@FindBy(id = password_id)
	private WebElement password;

	@FindBy(id = location_id)
	private WebElement location;

	@FindBy(id = login_id)
	private WebElement login;

	public OpenMRSLoginPageTestNG(WebDriver driver) { // Change to Constructor
		PageFactory.initElements(driver, this); // POM class methods initialized
	}

	public void validLogin() throws Throwable {
		// Scenario 1
			FileReaderManagerMRSTestNG data = new FileReaderManagerMRSTestNG();
			launchUrl(data.getDataProperty("url"));
			passInput(username, data.getDataProperty("loginusername"));
			passInput(password, data.getDataProperty("longinpassword"));
			elementClick(location);
			elementClick(login);
		
	}
}
