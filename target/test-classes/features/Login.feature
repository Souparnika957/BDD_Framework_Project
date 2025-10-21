Feature: Login Functionality

 Scenario: User Login with valid credentials
   Given User is on the Home Page
   And User clicks on Login Button
   When User enters username "vishalkalal1994@gmail.com" and password "Demo1234567890"
   And User clicks on login button
   Then User Should see the home Page title
 
 Scenario: User Login with invalid credentials
   Given User is on the Home Page
   And User clicks on Login Button
   When User enters username "vishalkalal1991@gmail.com" and password "Demo1234567890"
   And User clicks on login button
   Then User should get error "Your email or password is incorrect!"
   
 

   
   
   
   