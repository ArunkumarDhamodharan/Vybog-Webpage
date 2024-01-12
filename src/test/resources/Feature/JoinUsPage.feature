     Feature: To Verify the Vybog JoinUs webPage   

Scenario Outline: To Verify the Vybog JoinUs Page valid and Invalid Credentials 

Given User Should in Vybog joinUspage
When User should Enter the FirstName and LastName
And User Should Enterthe Email and ContactNumber
And User Should Attach the Resume File
And User Should Enter the Message 
Then JoinUs page verify Successfull 

 