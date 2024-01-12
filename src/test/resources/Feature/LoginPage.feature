Feature: To Verify The Vybog Login Webpage

Scenario Outline: To Verify the Vybog Login Webpage with Valid and Invalid Credentials
      
      Given User Should in Vybog Loginpage
      When  User should Enter the "<Username>" and "<Password>"
      And   User should Click the Eye and Rememeberme button
      And  User Should Click the Login button
      And User should Click the Lost Your Password button
      And User Should Click the Go to Vybog Link 
      And User Should Click the Vybog Logo Link 
      Then LoginPage Verfied Successfully
     
    Examples:
    
    |Username      |Password|
    |Test@123.com  |!@123456|
    |Test@123.com  |        |
    |              |!@123456|
    |              |        |
        
    
    
 