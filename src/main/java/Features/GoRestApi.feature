Feature: Validating Gorest Api for a user

Scenario: verify if user is successfully created 
Given create a user
When user is created with "post" http request
Then check data is created with status code 201 created
And "status" in response body is "Created"