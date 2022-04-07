#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@activity3
Feature: Testing with Tags
  

  @SimpleAlert @SmokeTest
  Scenario: Testing with Simple Alert
      GIVEN: User is on the page
			WHEN: User clicks the Simple Alert button
			THEN: Alert opens
			AND: Read the text from it and print it
			AND: Close the alert
			AND: Read the result text
			AND: Close Browser
  @ConfirmAlert
  Scenario: Testing with Confirm Alert
      GIVEN: User is on the page
			WHEN: User clicks the Confirm Alert button
			THEN: Alert opens
			AND: Read the text from it and print it
			AND: Close the alert with Cancel
			AND: Read the result text
			AND: Close Browser
  @PromptAlert
  Scenario Outline: Testing with Prompt Alert
  		GIVEN: User is on the page
			WHEN: User clicks the Prompt Alert button
			THEN: Alert opens
			AND: Read the text from it and print it
			AND: Write a custom message in it
			AND: Close the alert
			AND: Read the result text
			AND: Close Browser
    