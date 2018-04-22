Feature: Create account of Facebook2
As a user u need to open facebook home page and do the validations


Scenario Outline: Validate create user multiple fields21
Given User need to be on Facebook login page
When User enters user "<user>" first name 
And User enters user "<surname>" surname
And User enters mobile "<mobile>" number
Then User checks user "<user>" first name is present 
Then User checks mobile "<mobile>" number 
Then close browser
Examples:
	|  user	|  surname	| mobile		|
	| Tom		|  Jerry		|8765432127	|
	| Lorren|  hardy		|8765678769	|
	

