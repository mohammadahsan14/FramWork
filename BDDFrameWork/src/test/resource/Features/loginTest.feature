Feature: Login Functionality
  	This Feature deal with the login functionality of the application
  	     @test3
  Scenario: User should able to login with correct username and password
    Given Launch "<URL>"
    Then Click on Signin Button
    Then Enter "<username>" and "<password>"
    Then Click SignIn 
    Then Verify User In Home Page