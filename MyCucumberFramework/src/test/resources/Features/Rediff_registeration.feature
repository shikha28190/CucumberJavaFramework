Feature: Registeration Page Validation

	Scenario Outline: Check if user is getting registered successfully
		Given user is on User Registeration Page
		When user enter the details <Full_Name> , <Rediffmail_ID> , <Password> , <Alt_email_id> , <mobile_num> , <Date> , <Month> , <Year> , <country> and <city>
		And user clicks on Create Account button
		Then User should get registered
		
		Examples:
		|Full_Name|Rediffmail_ID|Password|Alt_email_id|mobile_num|Date|Month|Year|country|city|
		|Test User|testuser.2021|Welcome@1234|shikhau28@gmail.com|9845482545|28|01|1990|India|Bhopal|