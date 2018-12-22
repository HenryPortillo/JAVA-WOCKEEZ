package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class FunctionPage extends BaseClass {

	@FindBy(xpath="//div[@id='wrapper']/div[2]/ul/li[2]/a/b")
	public WebElement pim;

	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmp;
	
	@FindBy (id="firstName")
	public WebElement firstName;
	
	@FindBy (id="middleName")
	public WebElement middleName;
	
	@FindBy (id="lastName")
	public WebElement lastName;
	
	@FindBy (id="btnSave")
	public WebElement saveButton;
	
	@FindBy (id="btnSave")
	public WebElement verified;
	
	public FunctionPage() {
		PageFactory.initElements(driver, this);
	}
}


