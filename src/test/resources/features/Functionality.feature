#Author: andreco06@hotmail.com
Feature: Emp Functionality

Background: Given I logged into OrangeHRM 

Scenario: Add Employee
Given I logged into OrangeHRM 
And I navigated to the Add Employee Page
When I provide the first name, middle name and last name of the employee
Then I successfully added an employee



