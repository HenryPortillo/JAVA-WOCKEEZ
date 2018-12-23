package com.syntax.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import com.syntax.pages.FunctionPage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FunctionStep extends BaseClass {
	LoginPage login1;
	Actions hover1;
	FunctionPage obj;
	
	@Given("^I logged into OrangeHRM$")
	public void i_logged_into_OrangeHRM(){
	 login1=new LoginPage();
		CommonMethods.enterValue(login1.username,BaseClass.prop.getProperty("username") );
		CommonMethods.enterValue(login1.password,BaseClass.prop.getProperty("password"));
		CommonMethods.click(login1.btnLogin);

	}

	@Given("^I navigated to the Add Employee Page$")
	public void i_navigated_to_the_Add_Employee_Page()  {
		 hover1=new Actions(driver);
		  obj =new FunctionPage();
		 hover1.moveToElement(obj.pim).click().perform();
		 hover1.moveToElement(obj.addEmp).click().perform();
	}

	@When("^I provide the first name, middle name and last name of the employee$")
	public void i_provide_the_first_name_middle_name_and_last_name_of_the_employee()  {
		obj.firstName.sendKeys("Jalfin");
		obj.middleName.sendKeys("Galindo");
		obj.lastName.sendKeys("Saul");
		obj.saveButton.click();
	}

	@Then("^I successfully added an employee$")
	public void i_successfully_added_an_employee() {

		Assert.assertTrue(obj.verified.isDisplayed());
	}


}
